package webcrank
package data

import scalaz.scalacheck.ScalazProperties._

object MethodSpec extends test.Spec {
  "Method" should {
    "satisfy equals laws" ! equal.laws[Method]
  }
}
