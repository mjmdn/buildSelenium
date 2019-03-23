Feature: my feature file

Background:
Given launch Browser

And Max Browser
And Set Timeout
And URL passing
And Enter username as Demosalesmanager
And Enter password as crmsfa
And Click Login button

Scenario Outline: Create Lead
And Click Link CRMFA
And Click Create Lead
And Enter CompanyName as <compannName>
And Enter FirstName as <firstName>
And Enter LastName as <lastName>
When click Create Lead button
Then Verfy Create Lead Succesfully
		
		Examples:
		| compannName | firstName | lastName |
		| hexacorp | madhavan | TVR |
		
		











