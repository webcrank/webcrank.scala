package webcrank
package data

// FIX Complete.
case class Request(
  method: Method,
  version: HttpVersion,
  peer: Ip
)
