import scala.io.StdIn.readLine
import scala.sys.exit

object powerUnitConverter extends App {

  val title = "Konwerter jednostek"
  println(title)

  while (true) {

    val choice = readLine("Podaj co chcesz przeliczyć (Km/KW), (Kw,Km), (Nm/LbFt), (LbFt/Nm): ")
    if (choice == "kw") {
      //Konwersja KW na Km
      val kw = readLine("Podaj wartość Kw: ").toInt
      val kwtoKm = KwToKm(kw)
      val kwResult = "KW: " + kwtoKm.conversion
      println(kwResult)
    } else if (choice == "km") {
      //Konwersja Km na KW
      val km = readLine("Podaj wartość Km: ").toInt
      val kmToKw = KmToKw(km)
      val kmResult = "Km: " + kmToKw.conversion
      println(kmResult)
    } else if (choice == "nm") {
      //konwersja Nm na Lb/ft
      val nm = readLine("Podaj wartość Nm: ").toInt
      val nmtolb = NmToLbft(nm)
      val nmResult = "Lb/ft: " + nmtolb.conversion
      println(nmResult)
    } else if (choice == "lbft") {
      //konwersja Lb/ft na Nm
      val lbft = readLine("Podaj wartość Lb/ft: ").toInt
      val lbfttonm = LbftToNm(lbft)
      val lbResult = "Nm: " + lbfttonm.conversion
      println(lbResult)
    } else {
      println("Nieprawidłowy wybór")
    }

    val odp = readLine("Czy chcesz kontynuować? (t/n)")

    if (odp == "n") {
      println("Dziękuję za użycie")
      exit(0)
    }
  }
}