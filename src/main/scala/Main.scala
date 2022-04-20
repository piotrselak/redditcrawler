import net.ruippeixotog.scalascraper.browser.JsoupBrowser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._

object Main extends App {
    val browser = JsoupBrowser()
    val doc = browser.get("https://www.reddit.com/r/ProgrammerHumor/")
    val postItems = doc >> elementList("a div h3")
    val items = postItems.map(_ >> allText("h3"))
    println(items) 
}