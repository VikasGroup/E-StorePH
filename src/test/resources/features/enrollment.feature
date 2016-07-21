Feature: enrollment

@Reg
Scenario Outline: registration
Given user open the login page 
When user click on Register button
And preregister page should displayed with pop up window "<urlprereg>"
And  Choose "<language>" in the language dropdown
And  Enter "<IRID>" of referrer
And  Choose a "<country>" in Country I live in dropdown
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
|urlprereg|language|IRID|country|enrolmenttype|urlreg|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|1|hu041741|Indonesia||https://portal.qntest.com/eStore/registerindividual.aspx|