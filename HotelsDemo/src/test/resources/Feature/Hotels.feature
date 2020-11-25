Feature: hotels room reservation

Scenario: Verify room booking

    Given Navigate the Hotel 
    When  select destination as New York, New York, United States of America
    And  click on close button  
    And  select  check in and  date  
     And  click on check in close button 
     And  select check out and date
     And  click on check out close button 
     And  click on  Search button 
   # Then  successful open next page for see details