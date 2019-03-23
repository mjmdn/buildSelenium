Feature: my feature file







Scenario Outline: Create Lead
Given Enter username as <userName>
And Enter password as <passowrd>
And Click Login button
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
		
		











