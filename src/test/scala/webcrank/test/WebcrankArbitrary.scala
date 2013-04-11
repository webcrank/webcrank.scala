package webcrank
package test

import scalaz.Show, scalaz.syntax.show._
import org.scalacheck.{Pretty, Gen, Arbitrary}, Arbitrary.arbitrary

trait WebcrankArbitraries {
  /*
   * Courtesy of @purefn, see https://gist.github.com/purefn/5257660
   *
   * This character generator is similar to the default one from ScalaCheck, but it filters out:
   * 1. Unprintable control characters.  These cause problems in Mongo queries, and should not able
   *    to get into our database since they will not be present in inputs parsed from HTTP text.
   * 2. Characters that do not exist in the default platform encoding.  We can exclude a big range
   *    of these right away (which ScalaCheck does) because they're in the range used for two-
   *    character UTF-16 sequences, but others are only detected by checking Character.isDefined(_).
   *    The symptom of using a bad character in a string is that when you encode it to UTF-8 and
   *    back again, you get a different string, so any of our web and database tests that check the
   *    input against the output may fail-- and you'll see a question mark somewhere in the data,
   *    since that's how bad characters are displayed.
   * This involves building a humungous list of characters, but it only gets built once, and since
   * it's an array the random strings will be a bit faster than ScalaCheck's usual.
   */
  lazy val validUnicodeChars: Array[Char] = (9.toChar :: 10.toChar :: 13.toChar ::
    ((0x20.toChar to 0xD7FF.toChar) ++ (0xE000.toChar to Char.MaxValue)).filter(Character.isDefined).toList
    ).toArray

  def genUnicodeChar: Gen[Char] = Gen.oneOf(validUnicodeChars)
  def genUnicodeString: Gen[String] = Gen.listOf(genUnicodeChar).map(_.mkString)

  implicit def ShowPretty[A: Show](a: A): Pretty =
    Pretty(_ => a.shows)

  implicit def CaseInsensitiveArbitrary =
    Arbitrary(genUnicodeString map CaseInsensitive.apply)

  implicit def StatusCodeArbitrary =
    Arbitrary(arbitrary[Int] map StatusCode.apply)
}

object WebcrankArbitrary extends WebcrankArbitraries
