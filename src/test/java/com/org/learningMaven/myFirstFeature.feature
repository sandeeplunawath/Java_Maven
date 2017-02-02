Feature: To check the main tutorial course page

Scenario: To check that webdriver tutorial page has loaded
Given I navigate to mercury new tours.com
When I navigate to registration page
Then the page title should be visible
