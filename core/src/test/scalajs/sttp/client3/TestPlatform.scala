package sttp.client3

sealed trait TestPlatform
object TestPlatform {
  case object JVM extends TestPlatform
  case object JS extends TestPlatform
  case object Native extends TestPlatform

  val Current = JS
}
