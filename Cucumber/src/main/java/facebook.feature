
Feature: Facebook Signup

 
  Scenario Outline: Signup Functionality
  
    Given I want to navigate to facebook
    When I need to give username Password "<emailtxt>", "<passtxt>"
    Then I need to click signup button it signingup
    
  Examples:
  
    |emailtxt|passwordtxt|
    |abc@gmail.com|aaaaaaaa|
    |def@gmail.com|bbbbbbbb|
    |ijk@gmail.com|ccccccccc|
    |xyz@gmail.com|ffffffff|
    
   
   
   
    

  