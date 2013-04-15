package webcrank

// FIX Complete.
sealed trait Body
case class FixedLengthBody()
case class StreamingBody()
