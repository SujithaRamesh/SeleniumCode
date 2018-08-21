 Feature: Create Lead
 
 Scenario Outline: Create a new Lead
 
 And Enter the username as <uName>
 And Enter the password as <password>
 And Click on login button
 And Click on CRM/SFA
 And Click on Leads
 And Click on Create Lead
 And Enter the Company Name as <cName>
 And Enter the First Name as <fName>
 And Enter the Last Name as <lName>
 When Click on CreateButton
 Then Verify Lead is Created
 Examples:
 |uName|password|cName|fName|lName|
 |DemoSalesManager|crmsfa|Testleaf|Aarthi|A|
 |DemoCSR|crmsfa|Testleaf|Sujitha|Ramesh|
 
 Scenario: Create Lead Negative
 And Enter the username as DemoSalesManager
 And Enter the password as crmsfa1
 And Click on login button
 But Login is incorrect
 
 Scenario Outline: Create a new Lead
 
 And Enter the username as <uName>
 And Enter the password as <password>
 And Click on login button
 And Click on CRM/SFA
 And Click on Leads
 And Click on Create Lead
 And Enter the Company Name as <cName>
 And Enter the First Name as <fName>
 And Enter the Last Name as <lName>
 When Click on CreateButton
 Then Verify Lead is Created
 Examples:
 |uName|password|cName|fName|lName|
 |DemoSalesManager|crmsfa|Testleaf|Aarthi|A|
 |DemoCSR|crmsfa|Testleaf|Sujitha||
 