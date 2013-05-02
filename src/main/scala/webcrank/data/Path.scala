package webcrank
package data

// FIX Making assumption that they will always be parsed. True?
// FIX Clear up where encoding is handled. This is not good enough as it stands.
case class Path(parts: List[String]) {
  def string = parts.mkString("/")
}
