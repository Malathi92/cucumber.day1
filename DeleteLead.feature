Feature: DeleteLead functionality for leaftabs application

Scenario Outline: Delete lead functionalities
Given Open the Chrome browser
And Load the Url <url>
And Enter the valid username <username>
And Enter the valid password <password>
When Click on login button
Then Home page should be displayed
When Click on CRMSFA
When Click on Leads
When Click on FindLeads
When Click on phone
Given Enter the phone number<phnNum>
When Click on find leads
Then Get and print first resulting id
When Click on first id
When Click on Delete
When Click on Find Leads
Then Pass the deleted id to check
When Click on submit button
Then Check the deleted data avilability




Examples:
|url|username|password|phnNum|
|'http://www.leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|'8610783341'|