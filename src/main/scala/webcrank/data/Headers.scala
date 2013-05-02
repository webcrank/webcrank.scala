package webcrank
package data

import scalaz.CaseInsensitive

// FIX Better data structure for headers?
case class Headers(headers: Map[CaseInsensitive[String], Header]) {
  def get(name: String): Option[String] =
    headers.get(CaseInsensitive(name)).flatMap(_.get)

  def all(name: String): Vector[String] =
    headers.get(CaseInsensitive(name)).map(_.all).getOrElse(Vector())
}
