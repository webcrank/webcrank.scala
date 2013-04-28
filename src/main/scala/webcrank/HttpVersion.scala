package webcrank

import scalaz._, Scalaz._

case class HttpVersion(major: Int, minor: Int)

object HttpVersion {
  val Http09 = HttpVersion(0, 9)
  val Http10 = HttpVersion(1, 0)
  val Http11 = HttpVersion(1, 1)

  implicit val HttpVersionShow  =
    Show.showFromToString[HttpVersion]

  implicit val HttpVersionEqual =
    Equal.equalA[HttpVersion]

  implicit val HttpVersionOrder =
    Order.orderBy[HttpVersion, (Int, Int)](v => (v.major, v.minor))
}
