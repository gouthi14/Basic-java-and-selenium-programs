 Feature: Test facebook smoke scenario

Scenario Outline: Test login with vaild credentials

Given Open firefox and start application
When I enter valid "<username>" and valid "password" 
Then User should be able to login successfully

Examples:
|username | |password|
|goutham@gmail.com| |password|
|goutham1@gmail.com| |password1|
|goutham2@gmail.com| |password2|