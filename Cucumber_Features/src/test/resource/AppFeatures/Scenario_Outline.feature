Feature: Login Feature

Scenario Outline:
Login  fail - possible combinations
Given user is on application landing page
When user clicks on sign in button
Then user is displayed login screen
When user enters "<username>" in username field
And user enters "<password>" in password field
And user clicks sign in button
Then user gets login failed error message

Examples:
| username          |  password         |
| incorrectusername | 12345             |
| suripattem        | incorrectpassword |
| incorrectusername | incorrectpassword |