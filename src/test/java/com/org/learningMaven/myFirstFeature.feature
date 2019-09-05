Feature: To check the main tutorial course page

Scenario: To check that webdriver tutorial page has loaded
Given I navigate to Google.com
When I navigate to search page
Then the page title should be visible
Then Close Browser