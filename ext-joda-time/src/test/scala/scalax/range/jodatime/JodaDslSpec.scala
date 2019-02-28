package scalax.range.jodatime

import org.scalatest._
import org.scalatest.Matchers._
import scalax.range._

import java.time.{Duration => JDuration}
import org.joda.time._
import scala.concurrent.duration._


class JodaDslSpec extends WordSpec {

  "jodatime dsl" when {
    "org.joda.time.Instant" when {
      "FiniteDuration" should {
        "compile inclusive to"    in { "inclusive(Instant.now) to (Instant.now) by 1.second" should compile }
        "compile exclusive to"    in { "exclusive(Instant.now) to (Instant.now) by 1.second" should compile }
        "compile inclusive until" in { "inclusive(Instant.now) to (Instant.now) by 1.second" should compile }
        "compile exclusive until" in { "exclusive(Instant.now) to (Instant.now) by 1.second" should compile }
        "compile to"              in { "exclusive(Instant.now) to exclusive(Instant.now) by 1.second" should compile }
      }
      "java.time.Duration" should {
        "compile inclusive to"    in { "inclusive(Instant.now) to (Instant.now) by JDuration.ofSeconds(1)" should compile }
        "compile exclusive to"    in { "exclusive(Instant.now) to (Instant.now) by JDuration.ofSeconds(1)" should compile }
        "compile inclusive until" in { "inclusive(Instant.now) to (Instant.now) by JDuration.ofSeconds(1)" should compile }
        "compile exclusive until" in { "exclusive(Instant.now) to (Instant.now) by JDuration.ofSeconds(1)" should compile }
        "compile to"              in { "exclusive(Instant.now) to exclusive(Instant.now) by JDuration.ofSeconds(1)" should compile }
      }
      "org.joda.time.Duration" should {
        "compile inclusive to"    in { "inclusive(Instant.now) to (Instant.now) by Duration.standardSeconds(1)" should compile }
        "compile exclusive to"    in { "exclusive(Instant.now) to (Instant.now) by Duration.standardSeconds(1)" should compile }
        "compile inclusive until" in { "inclusive(Instant.now) to (Instant.now) by Duration.standardSeconds(1)" should compile }
        "compile exclusive until" in { "exclusive(Instant.now) to (Instant.now) by Duration.standardSeconds(1)" should compile }
        "compile to"              in { "exclusive(Instant.now) to exclusive(Instant.now) by Duration.standardSeconds(1)" should compile }
      }
      "Numeric" should {
        "compile inclusive to"    in { "inclusive(Instant.now) to (Instant.now) by 1" should compile }
        "compile exclusive to"    in { "exclusive(Instant.now) to (Instant.now) by 1" should compile }
        "compile inclusive until" in { "inclusive(Instant.now) to (Instant.now) by 1" should compile }
        "compile exclusive until" in { "exclusive(Instant.now) to (Instant.now) by 1" should compile }
        "compile to"              in { "exclusive(Instant.now) to exclusive(Instant.now) by 1" should compile }
      }
    }
    "org.joda.time.LocalDate" when {
      "FiniteDuration" should {
        "compile inclusive to"    in { "inclusive(LocalDate.now) to (LocalDate.now) by 1.second" should compile }
        "compile exclusive to"    in { "exclusive(LocalDate.now) to (LocalDate.now) by 1.second" should compile }
        "compile inclusive until" in { "inclusive(LocalDate.now) to (LocalDate.now) by 1.second" should compile }
        "compile exclusive until" in { "exclusive(LocalDate.now) to (LocalDate.now) by 1.second" should compile }
        "compile to"              in { "exclusive(LocalDate.now) to exclusive(LocalDate.now) by 1.second" should compile }
      }
      "java.time.Duration" should {
        "compile inclusive to"    in { "inclusive(LocalDate.now) to (LocalDate.now) by JDuration.ofSeconds(1)" should compile }
        "compile exclusive to"    in { "exclusive(LocalDate.now) to (LocalDate.now) by JDuration.ofSeconds(1)" should compile }
        "compile inclusive until" in { "inclusive(LocalDate.now) to (LocalDate.now) by JDuration.ofSeconds(1)" should compile }
        "compile exclusive until" in { "exclusive(LocalDate.now) to (LocalDate.now) by JDuration.ofSeconds(1)" should compile }
        "compile to"              in { "exclusive(LocalDate.now) to exclusive(LocalDate.now) by JDuration.ofSeconds(1)" should compile }
      }
      "org.joda.time.Duration" should {
        "compile inclusive to"    in { "inclusive(LocalDate.now) to (LocalDate.now) by Duration.standardSeconds(1)" should compile }
        "compile exclusive to"    in { "exclusive(LocalDate.now) to (LocalDate.now) by Duration.standardSeconds(1)" should compile }
        "compile inclusive until" in { "inclusive(LocalDate.now) to (LocalDate.now) by Duration.standardSeconds(1)" should compile }
        "compile exclusive until" in { "exclusive(LocalDate.now) to (LocalDate.now) by Duration.standardSeconds(1)" should compile }
        "compile to"              in { "exclusive(LocalDate.now) to exclusive(LocalDate.now) by Duration.standardSeconds(1)" should compile }
      }
      "Numeric" should {
        "compile inclusive to"    in { "inclusive(LocalDate.now) to (LocalDate.now) by 1" should compile }
        "compile exclusive to"    in { "exclusive(LocalDate.now) to (LocalDate.now) by 1" should compile }
        "compile inclusive until" in { "inclusive(LocalDate.now) to (LocalDate.now) by 1" should compile }
        "compile exclusive until" in { "exclusive(LocalDate.now) to (LocalDate.now) by 1" should compile }
        "compile to"              in { "exclusive(LocalDate.now) to exclusive(LocalDate.now) by 1" should compile }
      }
    }
    "org.joda.time.LocalTime" when {
      "FiniteDuration" should {
        "compile inclusive to"    in { "inclusive(LocalTime.now) to (LocalTime.now) by 1.second" should compile }
        "compile exclusive to"    in { "exclusive(LocalTime.now) to (LocalTime.now) by 1.second" should compile }
        "compile inclusive until" in { "inclusive(LocalTime.now) to (LocalTime.now) by 1.second" should compile }
        "compile exclusive until" in { "exclusive(LocalTime.now) to (LocalTime.now) by 1.second" should compile }
        "compile to"              in { "exclusive(LocalTime.now) to exclusive(LocalTime.now) by 1.second" should compile }
      }
      "java.time.Duration" should {
        "compile inclusive to"    in { "inclusive(LocalTime.now) to (LocalTime.now) by JDuration.ofSeconds(1)" should compile }
        "compile exclusive to"    in { "exclusive(LocalTime.now) to (LocalTime.now) by JDuration.ofSeconds(1)" should compile }
        "compile inclusive until" in { "inclusive(LocalTime.now) to (LocalTime.now) by JDuration.ofSeconds(1)" should compile }
        "compile exclusive until" in { "exclusive(LocalTime.now) to (LocalTime.now) by JDuration.ofSeconds(1)" should compile }
        "compile to"              in { "exclusive(LocalTime.now) to exclusive(LocalTime.now) by JDuration.ofSeconds(1)" should compile }
      }
      "org.joda.time.Duration" should {
        "compile inclusive to"    in { "inclusive(LocalTime.now) to (LocalTime.now) by Duration.standardSeconds(1)" should compile }
        "compile exclusive to"    in { "exclusive(LocalTime.now) to (LocalTime.now) by Duration.standardSeconds(1)" should compile }
        "compile inclusive until" in { "inclusive(LocalTime.now) to (LocalTime.now) by Duration.standardSeconds(1)" should compile }
        "compile exclusive until" in { "exclusive(LocalTime.now) to (LocalTime.now) by Duration.standardSeconds(1)" should compile }
        "compile to"              in { "exclusive(LocalTime.now) to exclusive(LocalTime.now) by Duration.standardSeconds(1)" should compile }
      }
      "Numeric" should {
        "compile inclusive to"    in { "inclusive(LocalTime.now) to (LocalTime.now) by 1" should compile }
        "compile exclusive to"    in { "exclusive(LocalTime.now) to (LocalTime.now) by 1" should compile }
        "compile inclusive until" in { "inclusive(LocalTime.now) to (LocalTime.now) by 1" should compile }
        "compile exclusive until" in { "exclusive(LocalTime.now) to (LocalTime.now) by 1" should compile }
        "compile to"              in { "exclusive(LocalTime.now) to exclusive(LocalTime.now) by 1" should compile }
      }
    }
    "org.joda.time.DateTime" when {
      "FiniteDuration" should {
        "compile inclusive to"    in { "inclusive(DateTime.now) to (DateTime.now) by 1.second" should compile }
        "compile exclusive to"    in { "exclusive(DateTime.now) to (DateTime.now) by 1.second" should compile }
        "compile inclusive until" in { "inclusive(DateTime.now) to (DateTime.now) by 1.second" should compile }
        "compile exclusive until" in { "exclusive(DateTime.now) to (DateTime.now) by 1.second" should compile }
        "compile to"              in { "exclusive(DateTime.now) to exclusive(DateTime.now) by 1.second" should compile }
      }
      "java.time.Duration" should {
        "compile inclusive to"    in { "inclusive(DateTime.now) to (DateTime.now) by JDuration.ofSeconds(1)" should compile }
        "compile exclusive to"    in { "exclusive(DateTime.now) to (DateTime.now) by JDuration.ofSeconds(1)" should compile }
        "compile inclusive until" in { "inclusive(DateTime.now) to (DateTime.now) by JDuration.ofSeconds(1)" should compile }
        "compile exclusive until" in { "exclusive(DateTime.now) to (DateTime.now) by JDuration.ofSeconds(1)" should compile }
        "compile to"              in { "exclusive(DateTime.now) to exclusive(DateTime.now) by JDuration.ofSeconds(1)" should compile }
      }
      "org.joda.time.Duration" should {
        "compile inclusive to"    in { "inclusive(DateTime.now) to (DateTime.now) by Duration.standardSeconds(1)" should compile }
        "compile exclusive to"    in { "exclusive(DateTime.now) to (DateTime.now) by Duration.standardSeconds(1)" should compile }
        "compile inclusive until" in { "inclusive(DateTime.now) to (DateTime.now) by Duration.standardSeconds(1)" should compile }
        "compile exclusive until" in { "exclusive(DateTime.now) to (DateTime.now) by Duration.standardSeconds(1)" should compile }
        "compile to"              in { "exclusive(DateTime.now) to exclusive(DateTime.now) by Duration.standardSeconds(1)" should compile }
      }
      "Numeric" should {
        "compile inclusive to"    in { "inclusive(DateTime.now) to (DateTime.now) by 1" should compile }
        "compile exclusive to"    in { "exclusive(DateTime.now) to (DateTime.now) by 1" should compile }
        "compile inclusive until" in { "inclusive(DateTime.now) to (DateTime.now) by 1" should compile }
        "compile exclusive until" in { "exclusive(DateTime.now) to (DateTime.now) by 1" should compile }
        "compile to"              in { "exclusive(DateTime.now) to exclusive(DateTime.now) by 1" should compile }
      }
    }
  }
}
