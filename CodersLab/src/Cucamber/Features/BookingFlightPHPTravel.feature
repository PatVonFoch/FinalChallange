Feature: Booking Flight
  Scenario: booking flight and creating an invoice
    Given an open PHP Travels page

    When main page opened user clicks flights menu
    And user enters location from "WAW", location to "JFK",
    And clicks ROUND TRIP,
    And departure date "2019-11-17" and Return date "2019-12-06"
    And user chooses number of passengers "1" , and clicks done
    And begin search
    Then User chooses second option of flights
    And decides to book as a guest
    And user chooses title, fills out name "Name" and surname "Surname"
    And user fills out e-mail "email". phone number "phone number". DOB "birth date"
    And user provides ID Number "ID number", Expiry Date "exp date" and nationality "nationality"
    And User fills out Payment information by providing CC type and its number "CCnumber"
    And User fills expiry month "exp month", expiry year"exp year",  and CVV "CVV number"
