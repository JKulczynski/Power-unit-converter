import scala.io.StdIn.readLine
import scala.sys.exit

object powerUnitConverter extends App {

  val title = "Power Unit Converter"
  println(title)

  while (true) {
    val choice = readLine("What do you want to calculate? (Hp/KW), (Kw/Hp), (Nm/LbFt), (LbFt/Nm): ")
    choice match {
      case "kw" => val kw = readLine("Write Kw: ").toInt
        val kwtoKm = KwToHp(kw)
        val kwResult = "Hp: " + kwtoKm.conversion
        println(kwResult)
      case "hp" => val km = readLine("Write Hp: ").toInt
        val kmToKw = HpToKw(km)
        val kmResult = "KW: " + kmToKw.conversion
        println(kmResult)
      case "nm" => val nm = readLine("Write Nm: ").toInt
        val nmtolb = NmToLbft(nm)
        val nmResult = "Lb/ft: " + nmtolb.conversion
        println(nmResult)
      case "lbft" => val lbft = readLine("Write Lb/ft: ").toInt
        val lbfttonm = LbftToNm(lbft)
        val lbResult = "Nm: " + lbfttonm.conversion
        println(lbResult)
      case _ => println("Error, You need to write a number")
    }

    val odp = readLine("Do you want to continue? (y/n)")

    odp match {
      case "y" =>
      case "n" => exit(0)
    }
  }
}