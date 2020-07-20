Feature: Podpoint purchase for Mitsubishi Outlander

  @TestToRun
  Scenario: Universal Socket connection type
    Given I am on the Url "https://checkout.pod-point.com/"
    When I select "Mitsubishi" and "Outlander" in the Select your car fields
    And I check the box "I am NOT eligible to claim the dealership discount as I did not come through a dedicated dealership"
    And I select "Universal Socket" option connection type
    Then the prices for the 7KW power rating contains the following
      | Fields          | Value   |
      | full price      | £879.00 |
      | with OLEV grant | £529.00 |
    When I click on the "7kW" power rating
    Then 6 compatible extras are shown
    When I choose the first compartible extra
    Then the Total price correctly matches 7kw unit price plus the compartible extra price




