package webcrank

// FIX Is non-emptyness important? Or is it only important for a set of headers?
case class Header(name: CaseInsensitive, values: Vector[String]) {
  def get: Option[String] =
    values.headOption

  def getOr(otherwise: String) =
    get.getOrElse(otherwise)

  def all: Vector[String] =
    values
}
