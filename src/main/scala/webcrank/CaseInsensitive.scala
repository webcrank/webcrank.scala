package webcrank

import scalaz._, Scalaz._

// FIX Name? Generalize to something like IsString?
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

  implicit val CaseInsensitiveOrder =
    Order.orderBy[CaseInsensitive, String](_.value)

  implicit val CaseInsensitiveMonoid =
    Monoid.instance[CaseInsensitive]((a, b) => CaseInsensitive(a.value |+| b.value), CaseInsensitive(""))
}
