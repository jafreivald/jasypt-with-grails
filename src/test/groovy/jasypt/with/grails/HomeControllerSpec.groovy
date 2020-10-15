package jasypt.with.grails

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class HomeControllerSpec extends Specification implements ControllerUnitTest<HomeController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test encrypted property is returned from index"() {
        given:"The encrypted property is properly decrypted"
	controller.testProp = "test"
	
	expect: "index returns the property"
	"test" == controller.index()
    }
}
