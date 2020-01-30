Feature: Login Test
Scenario Outline: Login with valid data
* User Launch the chrome
* User navigates to testme
* User clicks on SignIn button
* User enters as "<username>"
* User enter as "<password>"
* User clicks on login buttons
* validate login success!
Examples: 
|username|password|
|kowsalya2|kowsi123|
|lalitha|password123|