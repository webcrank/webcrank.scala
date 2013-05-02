package webcrank
package data

import scalaz.scalacheck.ScalazProperties._

object HttpVersionSpec extends test.Spec {
  "HttpVersion" should {
    "satisfy equals laws" ! equal.laws[HttpVersion]
    "satisfy order laws" ! order.laws[HttpVersion]
  }
}
