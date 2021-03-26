Feature: Search a fly in avianca page and select the second in the result

  @ConsultaAvianca
  Scenario: Select the second flight from the result of a search in avianca
    Given that costumer open up avianca page
    When He searches for a fly in the home page
    Then He should see the list of fly and select the second item