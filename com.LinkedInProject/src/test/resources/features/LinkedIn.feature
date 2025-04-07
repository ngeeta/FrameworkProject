Feature: Learning Module functionality 
Background:
Given user must be on linked in login page
When click on sign in
And user enters valid username and password
And user clicks on sign in button
Then the user is navigated to Homepage of linkedin
Given user clicks on grids
When user clicks on learning module

@SetStudyGoal
Scenario: To test weekly goal
And User clicks on my library
And Click on Set your weekly goal
Then Set the goal accordingly
And Validate whether the goal is set