Feature: Change info about the pet

  @petsTests @changeInfoAboutPet
  Scenario: Change info about the pet
    When I add new to the store
    Then I check the status of added pet
    And I change name of the pet to "Qwerty"
    Then I validate JSON Schema of received response