Feature: To validate the sign in functionality of facebook
Scenario: To validate the registeration
Given To launch the browser and maximize it
When To launch the url of the facebook

And Click the create new account

#One dimensional list
And To enter the firstname in the firstname text box
|Kiruthik|Dharsini|Malini|Rajesh|
And To enter the surname in the surname text field
And To pass the mail id in the mail id text box

#Two dimensional list
And To enter the valid password in the password field
|63873097|864375474|5732847984|94738963287|
|6726428653|8738562|91743287563|5387272938|
|63286328|8946328789|86487365298|9758932420|
|789473286|68927528957|896583264|97483659|
Then Close the entire browser


