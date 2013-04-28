package webcrank

case class Header(name: CaseInsensitive, values: Vector[String]) {
  def get: Option[String] =
    values.headOption

  def getOr(otherwise: String) =
    get.getOrElse(otherwise)

  def all: Vector[String] =
    values
}
