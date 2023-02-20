Feature: account login
I as user
want to login
for be able to use the page

Scenario: login in successfully
Given the user visit the login page
When the user enter the values for username and password
Then he should see the welcome page