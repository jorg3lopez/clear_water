package clear_water.customers

import spock.lang.Specification

class AccountTest extends Specification {

    def "Account  getters and setters work"() {
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
        def alkinlineActual = account.getAlkalineWater()
        def filteredActual = account.getFilteredWater()

        then:
        firstNameActual == firstNameExpected
        lastNameActual == lastNameExpected
        addressActual == addressExpected
        phoneNumberActual == phoneNumberExpected
        alkinlineActual == alkalineExpected
        filteredActual == filteredExpected
    }

    def "three parameter contructor works"() {
        given:
        def firstNameExpected = "clear"
        def lastNameExpected = "water"
        def phoneNumberExpected = "818-636-8796"
        def account = new Account(firstNameExpected,lastNameExpected,phoneNumberExpected)

        when:
        def firstNameActual = account.getFirstName()
        def lastNameActual = account.getLastName()
        def phoneNumberActual = account.getPhoneNumber()

        then:
        firstNameActual == firstNameExpected
        lastNameActual == lastNameExpected
        phoneNumberActual == phoneNumberExpected
    }

    def "five parameter constructor work"() {
        given:
        def firstNameExpected = "clear"
        def lastNameExpected = "water"
        def phoneNumberExpected = "818-636-8796"
        def alkalineExpected = 45
        def filteredExpected = 55
        def account = new Account(firstNameExpected,lastNameExpected,phoneNumberExpected,alkalineExpected,filteredExpected)

        when:
        def firstNameActual = account.getFirstName()
        def lastNameActual = account.getLastName()
        def phoneNumberActual = account.getPhoneNumber()
        def alkinlineActual = account.getAlkalineWater()
        def filteredActual = account.getFilteredWater()

        then:
        firstNameActual == firstNameExpected
        lastNameActual == lastNameExpected
        phoneNumberActual == phoneNumberExpected
        alkinlineActual == alkalineExpected
        filteredActual == filteredExpected
    }
}
