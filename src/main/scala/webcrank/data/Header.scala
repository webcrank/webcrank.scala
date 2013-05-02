package webcrank
package data

import scalaz.CaseInsensitive

case class Header(name: CaseInsensitive[String], values: Vector[String]) {
  def get: Option[String] =
    values.headOption

  def getOr(otherwise: String) =
    get.getOrElse(otherwise)

  def all: Vector[String] =
    values
}
