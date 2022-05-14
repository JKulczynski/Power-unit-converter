import scala.io.StdIn.readLine
import scala.sys.exit

object powerUnitConverter extends App {

  val title = "Konwerter jednostek"
  println(title)

  val choice = readLine("Podaj co chcesz przeliczyć (Km/KW), (Kw/Km), (Nm/LbFt), (LbFt/Nm): ")

    choice match {
      case "kw" => val kw = readLine("Podaj wartość Kw: ").toInt
        val kwtoKm = KwToKm(kw)
        val kwResult = "Km: " + kwtoKm.conversion
        println(kwResult)
      case "km" => val km = readLine("Podaj wartość Km: ").toInt
        val kmToKw = KmToKw(km)
        val kmResult = "KW: " + kmToKw.conversion
        println(kmResult)
      case "nm" => val nm = readLine("Podaj wartość Nm: ").toInt
        val nmtolb = NmToLbft(nm)
        val nmResult = "Lb/ft: " + nmtolb.conversion
        println(nmResult)
      case "lbft" => val lbft = readLine("Podaj wartość Lb/ft: ").toInt
        val lbfttonm = LbftToNm(lbft)
        val lbResult = "Nm: " + lbfttonm.conversion
        println(lbResult)
      case _ => println("Nieprawidłowy wybór")
    }

  val odp = readLine("Czy chcesz kontynuować? (t/n)")

  odp match {
    case "t" => choice
    case "n" => println("Dziękuję za użycie")
      exit(0)
  }
}