# Miniature Payroll System

A comprehensive payroll system designed to streamline and digitize payroll processes for businesses. This system covers user authentication, employee management, bonus and allowance tracking, payroll generation, and approval workflows. Developed using Java Spring Boot and integrated with a PostgreSQL database.

## Key Features

1. **User Authentication:**
   - Users can log in securely using their email and password.

2. **Employee Management:**
   - Admins can add employees with the following details:
     - First Name
     - Last Name
     - Other Names (optional)
     - Gender
     - Email
     - Hire Date
     - Role
     - Monthly Salary
     - Phone Number
     - Bank Account Number
   - Default passwords are assigned to users initially.

3. **Role-Based Permissions:**
   - Admins can add employees.
   - Accountants can add bonuses and allowances.
   - Accountants or senior accountants can generate and retrieve payroll information.
   - Only senior accountants can approve payroll information.

4. **Email Notification:**
   - A notification is sent to the senior accountant for payroll approval.

5. **Administrator Privileges:**
   - Create, update, and deactivate employee details.
   - Generate payroll for the month.

6. **Payroll Generation:**
   - Monthly payroll generation includes:
     - Name
     - Email
     - Basic Salary
     - Employee SSF (5% of basic salary)
     - Sum of all bonuses for the current month

## Tech Stack

- **Java Spring Boot**
- **PostgreSQL** (database)

## Additional Implementations

- **API Documentation:**
  - The payroll API is documented using Swagger.

- **Code Quality:**
  - Implemented Sonarlint extension for code quality.

- **Version Control:**
  - Utilized Git and GitHub for version control.

- **Seeder Implementation:**
  - All roles and admin accounts are seeded using a command line runner.

- **Security:**
  - Secured all endpoints, excluding login and Swagger, using Spring Security.

## Getting Started

To get started with the Miniature Payroll System, follow the instructions in the [Installation Guide](docs/installation-guide.md).

## Contributing

Contributions are welcome! Please check the [Contribution Guidelines](CONTRIBUTING.md) for more details.

## License

This project is licensed under the [MIT License](LICENSE).
