Feature: enrollment

@Reg
Scenario Outline: registration
Given user open the login page 
When user click on Register button
And preregister page should displayed with pop up window "<urlprereg>"
And  Enter "<IRID>" of referrer
And  Choose a "<country>" in Country I live in dropdown
And  Choose "<language>" in the language dropdown
And  Choose "<enrolmenttype>" 
And click next button
And then Confirm button
And validate registation page "<urlreg>"
And  Fill up the registration form and agree to the terms in enrollment
And  Fill up placement information
And  Choose enrolment package
Then Select Payment "<Option>"
And Enter payment details 
And click validate 
And click Confirm button
And validate recepit
Examples:
|urlprereg|language|IRID|country|enrolmenttype|urlreg|Option|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|0|hu041741|Iraq||https://portal.qntest.com/eStore/registerindividual.aspx|euro|