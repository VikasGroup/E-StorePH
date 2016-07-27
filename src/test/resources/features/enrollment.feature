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
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|1|hu041741|Indonesia||https://portal.qntest.com/eStore/registerindividual.aspx|us|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|2|hu041741|Libya||https://portal.qntest.com/eStore/registerindividual.aspx|us|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|2|hu041741|Burkina Faso||https://portal.qntest.com/eStore/registerindividual.aspx|us|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|0|hu041741|Iraq||https://portal.qntest.com/eStore/registerindividual.aspx|euro|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|3|hu041741|Hong Kong, SAR||https://portal.qntest.com/eStore/registerindividual.aspx|euro|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|3|hu041741|Kazakhstan||https://portal.qntest.com/eStore/registerindividual.aspx|us|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|5|hu041741|Tajikistan||https://portal.qntest.com/eStore/registerindividual.aspx|euro|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|9|hu041741|Georgia||https://portal.qntest.com/eStore/registerindividual.aspx|us|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|1|hu041741|Armenia||https://portal.qntest.com/eStore/registerindividual.aspx|euro|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|0|hu041741|Syrian Arab Republic||https://portal.qntest.com/eStore/registerindividual.aspx|us|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|2|hu041741|Azerbaijan||https://portal.qntest.com/eStore/registerindividual.aspx|euro|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|3|hu041741|Cote D'Ivoire||https://portal.qntest.com/eStore/registerindividual.aspx|us|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|4|hu041741|Ethiopia||https://portal.qntest.com/eStore/registerindividual.aspx|euro|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|8|hu041741|Others||https://portal.qntest.com/eStore/registerindividual.aspx|us|







Scenario Outline: registrationTunisia
Given user open the login page 
When user click on Register button
And preregister page should displayed with pop up window "<urlprereg>"
And  Enter "<IRID>" of referrer
And  Choose a "<country>" in Country I live in dropdown
And  Choose "<language>" in the language dropdown
And  Choose "<enrolmenttype>" 
And validate registation page "<urlreg>"
And  Fill up the registration form and agree to the terms in enrollment
Then Select Payment "<Option>" "<payment>"
And Enter payment details 
And click validate 
And click Confirm button
And validate recepit
Examples:
|urlprereg|language|IRID|country|enrolmenttype|urlreg|Option|payment|
|https://portal.qntest.com/eStore/preregister.aspx?referrer=|8|hu041741|Tunisia||https://portal.qntest.com/eStore/registerindividual.aspx|euro|ecard|