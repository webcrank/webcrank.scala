package webcrank
package data

import scalaz._, Scalaz._

// FIX Making assumption that they will always be parsed. True?
// FIX Clear up where encoding is handled. This is not good enough as it stands.
case class QueryString(parts: List[(String, Option[String])]) {
  def string = parts.map({
    case (name, value) => name + value.map("=" + _).orZero
  }).mkString("&")

  // FIX Build library.
}
