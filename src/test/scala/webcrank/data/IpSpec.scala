package webcrank
package data

import scalaz.scalacheck.ScalazProperties._

object IpSpec extends test.Spec {
  "Ip" should {
    "satisfy equals laws" ! equal.laws[Ip]
  }
}
