Feature: Test facebook smoke scenario

Scenario: Test login with vaild credentials

Given Open firefox and start application
When I enter valid username and valid password 
Then User should be able to login successfully