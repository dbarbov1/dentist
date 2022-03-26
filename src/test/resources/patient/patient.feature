Feature: Patient books an appointment

  Scenario Outline: Patient books an appointment
    Given Patient opens the screen to book an appointment
    When Enters first name: "<First name>"
    And Enters last name: "<Last name>"
    And Enters email address: "<Email address>"
    And Enters phone number: "<Phone>"
    And Selects date and time of appointment: "<Date and time>"
    And Clicks the button for booking an appointment
    Then Sees a response message: "<Message>"
    Examples:
      | First name | Last name | Email address      | Phone      | Date and time | Message                                                                                            |
      | Dilyan     | Barbov    | dilyan@example.com | 0895123456 | Selected      | You have successfully booked an appointment (Please confirm it in the email that we have sent you) |
      | Dilyan     | Barbov    | dilyan@example.com | 0895123456 | Selected      | Failed to book an appointment (selected period is not available)                                   |
      | Di         | Barbov    | dilyan@example.com | 0895123456 | Selected      | First name is too short (3 letters minimum)                                                        |
      | Dilyan     | Ba        | dilyan@example.com | 0895123456 | Selected      | Last name is too short (3 letters minimum)                                                         |
      | Dilyan     | Barbov    | dilyan,example.com | 0895123456 | Selected      | Invalid email address                                                                              |
      | Dilyan     | Barbov    | dilyan@example.com | 0895123    | Selected      | Invalid phone number                                                                               |
      | Dilyan     | Barbov    | dilyan@example.com | 0895123456 | Not selected  | Please select available appointment time                                                           |
      | Dilyan     |           | dilyan@example.com | 0895123456 | Selected      | Please enter last name                                                                             |
      |            | Barbov    | dilyan@example.com | 0895123456 | Selected      | Please enter first name                                                                            |
      | Dilyan     | Barbov    |                    | 0895123456 | Selected      | Please enter email address                                                                         |
      | Dilyan     | Barbov    | dilyan@example.com |            | Selected      | Please enter phone number                                                                          |