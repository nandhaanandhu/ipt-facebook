Feature: login the facebook account

Scenario: Launch the facebook account

Given enter the url
When user can get the text in the home page
When user enter the username
And user enter the passwrd
Then user click the login button

Scenario: next page of the facebook
When user take a screenshot of the page
Then user click the back button to go to main page

Scenario: user create a new account 

Given user click the create account button
When user enter the first name
When user enter the last name
When user enter the mailid
When user enter the re-entry emailid
When user enter the password
When user select the date in day
When user select the month
When user select the year
When user select the gender
When user click the signup button
Then user take a screenshots of the page


