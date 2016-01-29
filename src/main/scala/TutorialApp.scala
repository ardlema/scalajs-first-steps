import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery
import scala.scalajs.js.annotation.JSExport

object TutorialApp extends JSApp {
  def main(): Unit = {
    jQuery(setupUI _)
  }

  def setupUI(): Unit = {
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
  }

  @JSExport
  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>[message]</p>")
  }
}
