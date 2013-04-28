package webcrank

import scalaz._, Scalaz._

/**
 *  See:
 *   - [IANA assignments](http://www.iana.org/assignments/http-status-codes)
 *   - [RFC2518](http://tools.ietf.org/html/rfc2518)
 *   - [RFC2616](http://tools.ietf.org/html/rfc2616)
 *   - [RFC2774](http://tools.ietf.org/html/rfc2774)
 *   - [RFC4918](http://tools.ietf.org/html/rfc4918)
 *   - [RFC5842](http://tools.ietf.org/html/rfc5842)
 *   - [RFC-reschke-http-status-308-0](http://tools.ietf.org/html/draft-reschke-http-status-308-07)
 *   - [RFC6585](http://tools.ietf.org/html/rfc6585)
 */
// FIX add message?
case class StatusCode(code: Int)

object StatusCode {
  /* == Informational 1xx == */

  /** Defined in [RFC2616] */
  val Continue = StatusCode(100)

  /** Defined in [RFC2616] */
  val SwitchingProtocols = StatusCode(101)

  /** Defined in [RFC2518] */
  val Processing = StatusCode(102)


  /* == Successful 2xx == */

  /** Defined in [RFC2616] */
  val Ok = StatusCode(200)

  /** Defined in [RFC2616] */
  val Created = StatusCode(201)

  /** Defined in [RFC2616] */
  val Accepted = StatusCode(202)

  /** Defined in [RFC2616] */
  val NonAuthoritativeInformation = StatusCode(203)

  /** Defined in [RFC2616] */
  val NoContent = StatusCode(204)

  /** Defined in [RFC2616] */
  val ResetContent = StatusCode(205)

  /** Defined in [RFC2616] */
  val PartialContent = StatusCode(206)

  /** Defined in [RFC4918] */
  val MultiStatus = StatusCode(207)

  /** Defined in [RFC5842] */
  val AlreadyReported = StatusCode(208)

  /** Defined in [RFC3229] */
  val ImUsed = StatusCode(226)


  /* == Redirection 3xx == */

  /** Defined in [RFC2616] */
  val MultipleChoices = StatusCode(300)

  /** Defined in [RFC2616] */
  val MovedPermanently = StatusCode(301)

  /** Defined in [RFC2616] */
  val Found = StatusCode(302)

  /** Defined in [RFC2616] */
  val SeeOther = StatusCode(303)

  /** Defined in [RFC2616] */
  val NotModified = StatusCode(304)

  /** Defined in [RFC2616] */
  val UseProxy = StatusCode(305)

  /** Defined in [RFC2616] */
  val Reserved = StatusCode(306)

  /** Defined in [RFC2616] */
  val TemporaryRedirect = StatusCode(307)

  /** Defined in [RFC-reschke-http-status-308-07] */
  val PermanentRedirect = StatusCode(308)


  /* == Client Error 4xx == */

  /** Defined in [RFC2616] */
  val BadRequest = StatusCode(400)

  /** Defined in [RFC2616] */
  val Unauthorized = StatusCode(401)

  /** Defined in [RFC2616] */
  val PaymentRequired = StatusCode(402)

  /** Defined in [RFC2616] */
  val Forbidden = StatusCode(403)

  /** Defined in [RFC2616] */
  val NotFound = StatusCode(404)

  /** Defined in [RFC2616] */
  val MethodNotAllowed = StatusCode(405)

  /** Defined in [RFC2616] */
  val NotAcceptable = StatusCode(406)

  /** Defined in [RFC2616] */
  val ProxyAuthenticationRequired = StatusCode(407)

  /** Defined in [RFC2616] */
  val RequestTimeout = StatusCode(408)

  /** Defined in [RFC2616] */
  val Conflict = StatusCode(409)

  /** Defined in [RFC2616] */
  val Gone = StatusCode(410)

  /** Defined in [RFC2616] */
  val LengthRequired = StatusCode(411)

  /** Defined in [RFC2616] */
  val PreconditionFailed = StatusCode(412)

  /** Defined in [RFC2616] */
  val RequestEntityTooLarge = StatusCode(413)

  /** Defined in [RFC2616] */
  val RequestUriTooLong = StatusCode(414)

  /** Defined in [RFC2616] */
  val UnsupportedMediaType = StatusCode(415)

  /** Defined in [RFC2616] */
  val RequestedRangeNotSatisfiable = StatusCode(416)

  /** Defined in [RFC2616] */
  val ExpectationFailed = StatusCode(417)

  /** Defined in [RFC4918] */
  val UnprocessableEntity = StatusCode(422)

  /** Defined in [RFC4918] */
  val Locked = StatusCode(423)

  /** Defined in [RFC4918] */
  val FailedDependency = StatusCode(424)

  /** Defined in [RFC2817] */
  val UpgradeRequired = StatusCode(426)

  /** Defined in [RFC6585] */
  val PreconditionRequired = StatusCode(428)

  /** Defined in [RFC6585] */
  val TooManyRequests = StatusCode(429)

  /** Defined in [RFC6585] */
  val RequestHeaderFieldsTooLarge = StatusCode(431)


  /* == Server Error 5xx == */

  /** Defined in [RFC2616] */
  val InternalServerError = StatusCode(500)

  /** Defined in [RFC2616] */
  val NotImplemented = StatusCode(501)

  /** Defined in [RFC2616] */
  val BadGateway = StatusCode(502)

  /** Defined in [RFC2616] */
  val ServiceUnavailable = StatusCode(503)

  /** Defined in [RFC2616] */
  val GatewayTimeout = StatusCode(504)

  /** Defined in [RFC2616] */
  val HttpVersionNotSupported = StatusCode(505)

  /** Defined in [RFC2295] */
  val VariantAlsoNegotiates = StatusCode(506)

  /** Defined in [RFC4918] */
  val InsufficientStorage = StatusCode(507)

  /** Defined in [RFC5842] */
  val LoopDetected = StatusCode(508)

  /** Defined in [RFC2774] */
  val NotExtended = StatusCode(510)

  /** Defined in [RFC6585] */
  val NetworkAuthenticationRequired = StatusCode(511)

  implicit val StatusCodeShow  =
    Show.showFromToString[StatusCode]

  implicit val StatusCodeEqual =
    Equal.equalA[StatusCode]

  implicit val StatusCodeOrder =
    Order.orderBy[StatusCode, Int](_.code)
}
