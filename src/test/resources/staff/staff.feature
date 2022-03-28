Feature: Staff books an appointment

  Scenario Outline: Staff books an appointment
    Given Member of the staff opens the screen to book an appointment
    When Enters first name of patient : "<First name>"
    And Enters last name of patient : "<Last name>"
    And Enters email address of patient : "<Email address>"
    And Enters phone number of patient : "<Phone>"
    And Selects date and time of appointment for patient: "<Date and time>"
    And Clicks the button for booking an appointment for patient
    Then Sees a response message regarding appointment: "<Message>"