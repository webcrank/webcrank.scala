package webcrank
package data

// FIX Complete.
//    - Add dispatch bindings.
//    - Add header to cookie extraction.
//
case class Request(
  method: Method,
  path: Path,
  query: QueryString,
  dispatch: Path,
  version: HttpVersion,
  peer: Ip,
  headers: Headers,
  body: Body
)
