package webcrank
package test

import scalaz.Show, scalaz.syntax.show._
import org.scalacheck.{Pretty, Gen, Arbitrary}, Arbitrary.arbitrary, Gen.{frequency, oneOf}
import UnicodeArbitrary._
import HttpArbitrary._
import Method._

trait WebcrankArbitraries {
  implicit def ShowPretty[A: Show](a: A): Pretty =
    Pretty(_ => a.shows)

  implicit def CaseInsensitiveArbitrary =
    Arbitrary(genUnicodeString map CaseInsensitive.apply)

  implicit def StatusCodeArbitrary =
    Arbitrary(arbitrary[Int] map StatusCode.apply)

  implicit def MethodArbitrary: Arbitrary[Method] =
    Arbitrary(frequency(
      (98, oneOf(Options, Get, Head, Post, Put, Delete, Trace, Connect)),
      (2, genHttpToken map (ExtensionMethod.apply))
    ))
}

object WebcrankArbitrary extends WebcrankArbitraries
