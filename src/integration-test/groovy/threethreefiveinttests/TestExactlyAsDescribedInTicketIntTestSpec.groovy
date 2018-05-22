package threethreefiveinttests

import grails.testing.mixin.integration.Integration
import grails.transaction.*
import grails.gorm.transactions.Transactional
import groovy.util.logging.Slf4j
import spock.lang.Specification

@Slf4j
@Integration(applicationClass = Application.class)
@Rollback
class TestAsDescribedInTicketSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    @Transactional
    void "test something"() {
        expect:"fix me"
        true
    }
}
