import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery
import scala.scalajs.js.annotation.JSExport

object TutorialApp extends JSApp {
  def main(): Unit = {
    jQuery(setupUI _)
  }

  def setupUI(): Unit = {
    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>Hello World</p>")
  }

  @JSExport
  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>[message]</p>")
  }
}
