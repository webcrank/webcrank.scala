package webcrank
package data

import scalaz._, Scalaz._

// FIX not sure if this is really makes sense yet. Feels like there
//     could be a library for an IP type though.

// FIX add segments, v4 vs v6 distinction and ordering.

case class Ip(ip: String)

object Ip {
  implicit val IpShow  =
    Show.showFromToString[Ip]

  implicit val IpEqual =
    Equal.equalA[Ip]
}
