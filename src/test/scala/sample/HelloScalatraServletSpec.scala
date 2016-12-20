package sample

import org.scalatra.test.scalatest.ScalatraWordSpec

class HelloScalatraServletSpec extends ScalatraWordSpec {

  "GET / on ScalatraServlet" should {
    addServlet(classOf[HelloScalatraServlet], "/*")

    "return status 200" in {
      get("/") {
        status shouldEqual 200
      }
    }

    "return status 404" in {
      get("/unknown") {
        status shouldEqual 404
      }
    }
  }
}
