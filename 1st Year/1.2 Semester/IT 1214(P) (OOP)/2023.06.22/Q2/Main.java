/*Consider a scenario where you are developing a Hospital Management System. 
Implement the following classes using encapsulation, inheritance, and a 2D array to fulfill the requirements:

Create a class called Employee with the following attributes:

name (String): to store the employee's name.
salary (double): to store the employee's salary.
Provide appropriate getter and setter methods to access and modify the attributes.
Create a subclass called Doctor that inherits from the Employee class. 

The Doctor class should have an additional attribute:
specialization (String): to store the doctor's specialization.
Provide appropriate getter and setter methods to access and modify the attribute.

Create a subclass called Nurse that also inherits from the Employee class. The Nurse class should have an additional attribute:
shift (String): to store the nurse's shift (e.g., "Day" or "Night").
Provide appropriate getter and setter methods to access and modify the attribute.

Create a class called Hospital with the following attributes:
employees (2D array of Employees): to store the employees in the hospital.
Provide appropriate methods to add employees to the hospital, display all employees' details, and calculate the total salary expenditure of the hospital.
Write the Java code to implement the above requirements.*/

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(2, 2);

        Doctor doctor1 = new Doctor("Dr. Smith", 8000, "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Johnson", 9000, "Pediatrics");

        Nurse nurse1 = new Nurse("Nurse Davis", 5000, "Day");
        Nurse nurse2 = new Nurse("Nurse Wilson", 5500, "Night");

        hospital.addEmployee(doctor1, 0, 0);
        hospital.addEmployee(doctor2, 0, 1);
        hospital.addEmployee(nurse1, 1, 0);
        hospital.addEmployee(nurse2, 1, 1);

        hospital.displayEmployees();

        double totalSalaryExpenditure = hospital.calculateTotalSalaryExpenditure();
        System.out.println("Total Salary Expenditure: " + totalSalaryExpenditure);
    }
}
