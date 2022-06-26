Feature: MergeContact functionality for leaftabs application

Scenario Outline: Merge contact functionalities
Given Open the Chrome browser
And Load the Url <url>
And Enter the valid username <username>
And Enter the valid password <password>
When Click on login button
Then Home page should be displayed
When Click on CRMSFA
When Click on Contacts
When Click on Merge Contacts
Then Merge Contact page should be displayed
When Click on first lead
When click on second lead
When Click on Merge button
Then Alert box should be displayed

Examples:
|url|username|password|
|'http://www.leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|
