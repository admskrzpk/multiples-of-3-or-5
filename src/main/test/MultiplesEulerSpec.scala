import org.scalatest.funspec.AnyFunSpec

class MultiplesEulerSpec extends AnyFunSpec {

  import MultiplesEuler.multiplesEuler

  describe("Range") {
    describe("when boarder is 1000") {
      it("should have size 233168") {
        assert(multiplesEuler(1000) == 233168)
      }
    }
  }

  describe("Range") {
    describe("when boarder is 10") {
      it("should have size 23") {
        assert(multiplesEuler(10) == 23)
      }
    }
  }
}