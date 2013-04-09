package webcrank

import scalaz.scalacheck.ScalazProperties._

object CaseInsensitiveSpec extends test.Spec {
 "CaseInsensitive" should {
   "satisfy equals laws" ! equal.laws[CaseInsensitive]
   "satisfy order laws" ! order.laws[CaseInsensitive]
   "satisfy monoid laws" ! monoid.laws[CaseInsensitive]
 }
}
