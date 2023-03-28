package nl.codecraftr.sbt.multimodule.domain

import nl.codecraftr.sbt.multimodule.core.{WIP, WordSpec}

class DomainSpec extends WordSpec {
  "domain" should {
    "run tests" in {
      true shouldBe true
    }

    "skip tests" taggedAs WIP in {
      true shouldBe false
    }
  }
}
