package webcrank
package data

import scalaz.scalacheck.ScalazProperties._

object HeadersSpec extends test.Spec {
  "Headers" should {
    "satisfy equals laws" ! equal.laws[Headers]
  }
}
