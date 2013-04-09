package webcrank

import scalaz._, Scalaz._

case class CaseInsensitive(value: String) {
  lazy val toLower = value

  override def hashCode =
    toLower.hashCode

  override def equals(o: Any) =
    o.isInstanceOf[CaseInsensitive] &&
      o.asInstanceOf[CaseInsensitive].toLower == toLower
}

object CaseInsensitive {
  implicit val CaseInsensitiveShow  =
    Show.showFromToString[CaseInsensitive]

  implicit val CaseInsensitiveEqual =
    Equal.equalA[CaseInsensitive]
}
