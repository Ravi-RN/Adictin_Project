Feature: Online hotel application

Scenario: Onilne hotel booking new user register page

Given user launch the url
When User click the new user register link


Scenario: New user registration form

When User send the minimum eight character with username
And User send the minimum five character with password
And User send the confirm password
And User send the full name
And User send the email address
And User enter the captcha
And User click the agree checkbox
And User click the register button 
Then see the next page 

Scenario: Return to login page

When user click the click here to login link

Scenario: Exsiting user login page

When user send the username
And User send the password
And User click the login button

