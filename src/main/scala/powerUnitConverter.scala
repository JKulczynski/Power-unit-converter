import scala.io.StdIn.readLine
import scala.sys.exit

object powerUnitConverter extends App {

  val title = "Konwerter jednostek"
  println(title)

  val choice = readLine("Wybierz co chcesz przeliczyć: 1. Moment obrotowy 2.Moc: ")
  val moment = readLine("Wybierz parę którą chcesz przeliczyć: 1.Nm na lb/ft 2.lb/ft na Nm: ")
  val pwr = readLine("Wybierz parę którą chcesz przeliczyć: 1.KM na Kw 2.Kw na KM: ")

}