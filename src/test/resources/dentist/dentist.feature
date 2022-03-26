Feature: Dentist sets available period

  Scenario Outline: Dentist sets available period
    Given Dentist opens the screen to add available period
    When Enters year: "<Year>"
    And Enters month: "<Month>"
    And Enters day: "<Day>"
    And Enters hour: "<Hour>"
    And Enters minutes: "<Minutes>"
    And Click the button for adding available period
    Then Sees a response message: "<Message>"
    Examples:
      | Year | Month | Day | Hour | Minutes | Message                                |
      | 122  | 4     | 4   | 14   | 20      | Available period is added successfully |
      | 0    | 4     | 4   | 14   | 20      | Invalid Value for year                 |
      | 122  | 13    | 4   | 14   | 20      | Invalid Value for month                |
      | 122  | 4     | 35  | 14   | 20      | Invalid Value for day                  |
      | 122  | 4     | 4   | 25   | 20      | Invalid Value for hour                 |
      | 122  | 4     | 4   | 14   | 64      | Invalid Value for minutes              |
