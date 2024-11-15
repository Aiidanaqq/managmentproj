This is a simple JavaFX application for managing employees. The system allows you to add different types of employees (Full-time, Part-time, Contractor), calculate their salaries, and display their information in a table format.



## Features
Add employees of different types: Full-time, Part-time, and Contractor.
Automatically calculate employee salaries based on type and input.
Display employee details in a table with columns: Name, Type, and Salary.
Remove selected employees from the table.



## Project Structure


The project consists of the following components:

#### Employee Class: 
An abstract class that defines common properties like name and type for all employees.
#### Full-Time Employee: 
A class representing full-time employees with a fixed salary.
#### Part-Time Employee:
A class representing part-time employees, where the salary is based on hourly rate and hours worked.
#### Contractor: 
A class representing contractors, where the salary is based on hourly rate and hours worked.
#### HelloController: 
The controller for handling user input, interactions, and updating the UI.
#### HelloApplication: 
The main application class responsible for launching the JavaFX interface.
#### hello-view.fxml: 
FXML file that defines the structure and design of the user interface.



## Requirements
To run the application, you will need the following:

Java 11 or higher
JavaFX SDK
An IDE like IntelliJ IDEA or any other IDE with JavaFX support
Scene Builder (for editing FXML files)

# Usage
The user interface consists of the following components:

## Input Fields:

#### Name: 
Enter the employee's name.
#### Type: 
Select the type of employee (Full-time, Part-time, Contractor).
#### Rate/Salary: 
Enter the fixed salary for full-time employees or the hourly rate for part-time and contractor employees.
#### Hours: 
Enter the number of hours worked for part-time and contractor employees.


## Buttons:

#### Add Employee: 
Adds an employee to the list.
#### Remove Employee: 
Removes a selected employee from the list.
## Employee Table:

#### Displays the employee list with the following columns: 
Name, Type, and Salary.

## How to Add an Employee
Fill in the Name field with the employee's name.
Select the employee Type from the dropdown menu (Full-time, Part-time, or Contractor).

### Enter the Rate/Salary:
For Full-time employees, enter the fixed salary.
For Part-time and Contractor employees, enter the hourly rate.
Enter the number of Hours worked if the employee is part-time or a contractor.
Click the Add Employee button to add the employee to the table.


### How to Remove an Employee
Select an employee from the table.
Click the Remove Employee button to delete the selected employee.
