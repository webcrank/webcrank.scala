package webcrank

import scalaz._, Scalaz._

/** http://www.w3.org/Protocols/rfc2616/rfc2616-sec5.html#sec5.1.1 */
sealed trait Method

object Method {
  case object Options extends Method
  case object Get extends Method
  case object Head extends Method
  case object Post extends Method
  case object Put extends Method
  case object Delete extends Method
  case object Trace extends Method
  case object Connect extends Method
  case class ExtensionMethod(token: String) extends Method

  implicit val MethodShow =
    Show.showFromToString[Method]

  implicit val MethodEqual =
    Equal.equalA[Method]
}
