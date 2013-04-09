package webcrank

import scalaz.scalacheck.ScalazProperties._

object CaseInsensitiveSpec extends test.Spec {
 "CaseInsensitive" should {

   "satisfy equals laws" ! equal.laws[CaseInsensitive]

 }
}
