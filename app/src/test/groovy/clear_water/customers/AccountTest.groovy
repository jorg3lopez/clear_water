package clear_water.customers

import spock.lang.Specification

class AccountTest extends Specification {

    def "Account  getter and setter work"() {
        given:
        def firstNameExpected = "clear"
        def lastNameExpected = "water"
        def addressExpected = "1234 fake-address"
        def phoneNumberExpected = "818-636-8796"
        def alkalineExpected = 45
        def filteredExpected = 55
        def account = new Account(firstNameExpected,lastNameExpected,addressExpected,phoneNumberExpected,alkalineExpected,filteredExpected)

        when:
        def firstNameActual = account.getFirstName()
        def lastNameActual = account.getLastName()
        def addressActual = account.getAddress()
        def phoneNumberActual = account.getPhoneNumber()
        def alkinlineActual = account.getAlkaline()
        def filteredActual = account.getFiltered()

        then:
        firstNameActual == firstNameExpected
        lastNameActual == lastNameExpected
        addressActual == addressExpected
        phoneNumberActual == phoneNumberExpected
        alkinlineActual == alkalineExpected
        filteredActual == filteredExpected
    }

}
