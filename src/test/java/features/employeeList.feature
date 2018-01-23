Feature: navigate successfully to employee list page

@TC_NAVEMP_001
Scenario:Navigate to Employee List Page
Given admin on login page
When admin enters username,password
| username | password |
| Admin    | Admin    |
And clicks login button
Then admin should enter into dashboard page
When user selects PIM on left hand side panel
And user selects Employee List From PIM menu
Then user should navigate to Employee list page
And should be able to see list of employees