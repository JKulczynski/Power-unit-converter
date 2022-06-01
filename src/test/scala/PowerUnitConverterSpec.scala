import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class PowerUnitConverterSpec extends AnyFlatSpec with should.Matchers {

  behavior of "powerUnitConverter"

  it should "return proper conversion value from Hp to Kw" in {
    val km = HpToKw(100)
    val actual = km.conversion
    val expected = 74.5699872
    actual shouldBe expected
  }

  it should "return proper conversion value from Kw to Hp" in {
    val kw = KwToHp(100)
    val actual = kw.conversion
    val expected = 134.10220900000002
    actual shouldBe expected
  }

  it should "return proper conversion value from Nm to lb/ft" in {
    val nm = NmToLbft(100)
    val actual = nm.conversion
    val expected = 73.8
    actual shouldBe expected
  }

  it should "return proper conversion value from lb/ft to Nm" in {
    val lb = LbftToNm(100)
    val actual = lb.conversion
    val expected = 135.60000000000002
    actual shouldBe expected
  }


}
