public class Hospital {
    private Employee[][] employees;

    public Hospital(int numRows, int numCols) {
        employees = new Employee[numRows][numCols];
    }

    public void addEmployee(Employee employee, int row, int col) {
        employees[row][col] = employee;
    }

    public void displayEmployees() {
        for (Employee[] row : employees) {
            for (Employee employee : row) {
                if (employee != null) {
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Salary: " + employee.getSalary());

                    if (employee instanceof Doctor) {
                        Doctor doctor = (Doctor) employee;
                        System.out.println("Specialization: " + doctor.getSpecialization());
                    } else if (employee instanceof Nurse) {
                        Nurse nurse = (Nurse) employee;
                        System.out.println("Shift: " + nurse.getShift());
                    }

                    System.out.println();
                }
            }
        }
    }

    public double calculateTotalSalaryExpenditure() {
        double totalSalary = 0;

        for (Employee[] row : employees) {
            for (Employee employee : row) {
                if (employee != null) {
                    totalSalary += employee.getSalary();
                }
            }
        }

        return totalSalary;
    }
}
