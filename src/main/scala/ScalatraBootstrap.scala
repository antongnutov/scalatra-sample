import org.scalatra._
import javax.servlet.ServletContext

import sample.HelloScalatraServlet

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new HelloScalatraServlet, "/*")
  }
}
