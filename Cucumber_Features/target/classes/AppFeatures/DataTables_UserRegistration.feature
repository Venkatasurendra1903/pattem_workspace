Feature: User registration

#for AsLists
Scenario: user registration with differnt data
Given user is on registration page
When user enters following user details
	| suri | pattem | suri@gmail.com | 863938 | Nellore|
	| shasi | peta | sasi@gmail.com | 239843 | tpt|
	| sai | peddi | sai@gmail.com | 87475 | hyd|
	| pavan | nasina | pavan@gmail.com | 98452 | nellore|
Then user registration sholud be successful

#for AsMaps
Scenario: user registration with differnt data with coloumns
Given user is on registration page
When user enters following user details with coloumns
	| firstname | lastname | email | phone no | city|
	| suri | pattem | suri@gmail.com | 863938 | Nellore|
	| shasi | peta | sasi@gmail.com | 239843 | tpt|
	| sai | peddi | sai@gmail.com | 87475 | hyd|
	| pavan | nasina | pavan@gmail.com | 98452 | nellore|
Then user registration sholud be successful  