Feature: Navigating to md5 test screen
  As a user
  I want to navigate to md5jsontestcom
  So that I can start to verify any md5 checksums

  @p1 @positive
  Scenario Outline: Navigate to md5jsontestcom with '<parameter>'
    Given I navigate to md5jsontestcom with parameter '<parameter>'
    When I parse returned md5 from parameter with '<parameter>'
    Then It should match with java comparison
    Examples:
      | parameter |
      | Hello     |
      | 566       |
      | High-5    |
      | fyber     |
      | BERLIN    |


  @p2 @intentionalFail @ignore
  Scenario: Navigate to md5jsontestcom with 'Hello'
    Given I navigate to md5jsontestcom with parameter 'Hello'
    When I parse returned md5 from parameter with 'This will fail.'
    Then It should match with java comparison