Feature: Uber Booking Feature

Scenario: Booking Cab
Given User wants to select a car type "bmw" from uber app
When User selects car "bmw" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD