package webcrank
package test

import data._
import scalaz.{Show, CaseInsensitive}, scalaz.syntax.show._
import scalaz.scalacheck.ScalazArbitrary._
import org.scalacheck.{Pretty, Gen, Arbitrary}, Arbitrary.arbitrary, Gen.{frequency, oneOf}
import UnicodeArbitrary._
import HttpArbitrary._
import Method._

trait WebcrankArbitraries {
  implicit def ShowPretty[A: Show](a: A): Pretty =
    Pretty(_ => a.shows)

  implicit def VectorArbitrary[A: Arbitrary] =
    Arbitrary(arbitrary[List[A]] map (_.toVector))

  implicit def StatusCodeArbitrary =
    Arbitrary(arbitrary[Int] map StatusCode.apply)

  implicit def MethodArbitrary: Arbitrary[Method] =
    Arbitrary(frequency(
      (98, oneOf(Options, Get, Head, Post, Put, Delete, Trace, Connect)),
      (2, genHttpToken map (ExtensionMethod.apply))
    ))

  implicit def HttpVersionArbitrary =
   Arbitrary(frequency(
      (9, oneOf(HttpVersion.Http09, HttpVersion.Http10, HttpVersion.Http11)),
      (1, arbitrary[(Int, Int)] map (HttpVersion.apply _).tupled)
    ))

  implicit def HeadersArbitrary =
   Arbitrary(arbitrary[Map[CaseInsensitive[String], Vector[String]]] map Headers.apply)
}

object WebcrankArbitrary extends WebcrankArbitraries
