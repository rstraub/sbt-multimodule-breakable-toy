package nl.codecraftr.sbt.multimodule.domain

import org.scalatest.BeforeAndAfter
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.mockito.MockitoSugar

class DomainSpec
    extends AnyWordSpec
    with Matchers
    with MockitoSugar
    with BeforeAndAfter {

  before {
    println("fires before every test")
  }

  "domain" should {
    "run tests" in {
      true shouldBe true
    }
  }
}
