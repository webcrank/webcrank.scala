package webcrank

import scalaz.scalacheck.ScalazProperties._

object StatusCodeSpec extends test.Spec {
 "StatusCode" should {
   "satisfy equals laws" ! equal.laws[StatusCode]
   "satisfy order laws" ! order.laws[StatusCode]
 }
}
