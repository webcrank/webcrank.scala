package webcrank
package data

// FIX Complete.
//    - Add path related fields.
//    - Add header to cookie extraction.
//
case class Request(
  method: Method,
  path: Path,
  version: HttpVersion,
  peer: Ip,
  headers: Headers,
  body: Body
)
