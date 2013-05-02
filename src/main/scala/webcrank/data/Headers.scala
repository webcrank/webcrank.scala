package webcrank
package data

// FIX Data structure for headers?
case class Headers(headers: Map[CaseInsensitive, Header]) {
  def get(name: String): Option[String] =
    getc(CaseInsensitive(name))

  // FIX Naming conventions.
  def getc(name: CaseInsensitive): Option[String] =
    headers.get(name).flatMap(_.get)

  def all(name: String): Vector[String] =
    allc(CaseInsensitive(name))

  // FIX Naming conventions.
  def allc(name: CaseInsensitive): Vector[String] =
    headers.get(name).map(_.all).getOrElse(Vector())
}
