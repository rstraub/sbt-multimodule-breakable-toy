package nl.codecraftr.sbt.multimodule.core

import org.scalatest.BeforeAndAfter
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.mockito.MockitoSugar

class CoreSpec
    extends AnyWordSpec
    with Matchers
    with MockitoSugar
    with BeforeAndAfter {

  before {
    println("fires before every test")
  }

  "core" should {
    "run tests" in {
      true shouldBe true
    }
  }
}
