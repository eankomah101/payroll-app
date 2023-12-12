MINIATURE PAYROLL

Built a System that will help a company digitalise its payroll processes 
from end to end. 
The roles and the admin were seeded when the application starts.
The System is able to 
i. Allow users to log in with email and password
ii. add employees (done by admin)
iii. add bonuses and allowances (done by accountant)
iv. generate and retrieve payroll information (accountant or senior 
accountant). Only the senior accountant is able to approve the 
payroll information.
v. Sent an email notification to the senior accountant to approve the payroll 
when it is generated.

The administrator of the system will be able to: 
1. create an employee with the fields listed below 
a. first name 
b. last name 
c. other names (optional) 
d. gender 
e. email 
f. hire date 
g. role
other user information included monthly salary, phone number and bank 
account number. User was given a default password to start with. 

2. update the details of an existing employee.
3. deactivate an employee.
4. generate payroll for the month.
At the end of every month, the accountant clicks the generate payroll button. The 
payroll API  saves user information such as name, email, basic salary, employee 
SSF (5% of basic salary), and the sum of all bonuses (all for the current month) for each
employee. 

TECH STACK 
• Java Spring boot 
• Postgres (database)

ADDITIONALLY
I Documented the payroll API with swagger 
Used the Sonarlint extension 
Used version control (Git and GitHub) 
Implemented all seeders with a command line runner
Secured all endpoints except the login and swagger endpoint and also Spring Security
