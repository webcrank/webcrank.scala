package webcrank

import Cookie._

// FIX In progress: still trying to model everything.
case class Cookie(
  secure: Boolean,
  httponly: Boolean,
  path: String,
  domain: String,
  comment: String,
  maxage: Int,
  expires: DateTime,
  version: CookieVersion
)

object Cookie {
  // FIX Placeholders while building out types.
  type CookieVersion = String
  type DateTime = String
}
