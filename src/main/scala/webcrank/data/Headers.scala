package webcrank
package data

import scalaz._, Scalaz._

// FIX Better data structure for headers?
case class Headers(headers: Map[CaseInsensitive[String], Vector[String]]) {
  def get(name: String): Option[String] =
    headers.get(CaseInsensitive(name)).flatMap(_.headOption)

  def all(name: String): Vector[String] =
    headers.get(CaseInsensitive(name)).getOrElse(Vector())
}

object Headers {
  implicit val HeadersShow  =
    Show.showFromToString[Headers]

  implicit val HeadersEqual =
    Equal.equalA[Headers]
}
