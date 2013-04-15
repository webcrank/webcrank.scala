package webcrank
package test

import scalaz.Show, scalaz.syntax.show._
import org.scalacheck.Gen, Gen.{listOf1, oneOf}

/* http://www.w3.org/Protocols/rfc2616/rfc2616-sec2.html#sec2 */
trait HttpArbitraries {
  lazy val httpChar =
    (0.toChar to 127.toChar).toList

  lazy val httpSp =
    32.toChar

  lazy val httpHt =
    9.toChar

  lazy val httpSeparators =
    '(' :: ')' :: '<' :: '>' :: '@' ::
    ',' :: ';' :: ':' :: '\\' :: '"' ::
    '/' :: '[' :: ']' :: '?' :: '=' ::
    '{' :: '}' :: httpSp :: httpHt :: Nil

  lazy val httpCtl =
    (0.toChar to 31.toChar).toList ++ (127.toChar :: Nil)

  lazy val httpTokenChar =
    httpChar.filter(c => !httpSeparators.contains(c) && !httpCtl.contains(c))

  implicit def genHttpToken: Gen[String] =
    listOf1(oneOf(httpTokenChar)) map (_.mkString)


}

object HttpArbitrary extends HttpArbitraries
