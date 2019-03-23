Feature: Login


Scenario Outline: Login
	    Given Enter the username as <userName>
		And Enter the password as <password>
		When clicking Login
		
		
		Examples:
		| userName | password |
		| demosalesmanager | crmsfa |
		
