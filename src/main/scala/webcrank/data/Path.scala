package webcrank
package data

// FIX Un-stringly these, anything that is a path should be able to be
//     handled as a whole or as parts. Consider rename of this overarching
//     data type.
case class Path(
  path: String,              // full path after host and port, excluding query string
  dispatch: String,          // dispatch path of resource i.e. `path` less root of resource
  raw: String,               // full path including query string
  info: Map[String, String], // dispatch bindings. FIX better?
  query: String              // query string
)
