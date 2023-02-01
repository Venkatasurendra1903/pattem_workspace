@all
Feature: Uber Booking Feature2

@smoke
Scenario: Booking Cab Sedan
Given User1 wants to select a type "sedan1" from uber application
When User1 selects car " sedan1" and pick up point "Bangalore1" and drop location "Pune1"
Then Driver1 starts the journey
And Driver1 ends the journey
Then User1 pays 1000 USD

@sanity
Scenario: Booking Cab Sedan2
Given User1 wants to select a type "sedan13" from uber application
When User1 selects car " sedan13" and pick up point "Bangalore13" and drop location "Pune13"
Then Driver1 starts the journey
And Driver1 ends the journey
Then User1 pays 1000 USD

@suri
Scenario: Booking Cab Sedan3
Given User1 wants to select a type "sedan12" from uber application
When User1 selects car " sedan12" and pick up point "Bangalore12" and drop location "Pune21"
Then Driver1 starts the journey
And Driver1 ends the journey
Then User1 pays 1000 USD
