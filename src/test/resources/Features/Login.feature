Feature: 

  @sanity
  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When User enters username as "Admin" and password as "admin123" And Click on Login
    Then Page Title should be "OrangeHRM"
    When User click on Log out link
    Then Page Title should be "OrangeHRM"	