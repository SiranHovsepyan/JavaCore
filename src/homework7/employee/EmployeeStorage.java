package homework7.employee;

import classwork.library.Book;

public class EmployeeStorage {
    private Employee[] employees= new Employee[10];
    private int size;
    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName() + " " + employees[i].getSurname() +
                    " " + employees[i].getEmployeeID() + " " + employees[i].getSalary()+" "
                    + employees[i].getCompany()+" "+employees[i].getPosition());
        }
    }

    public void search(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().contains(employeeID)){
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() +
                        " " + employees[i].getEmployeeID() + " " + employees[i].getSalary()+" "
                        + employees[i].getCompany()+" "+employees[i].getPosition());
            }
        }
    }


    public void searchEmployee(String companyName) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(companyName)){
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() +
                        " " + employees[i].getEmployeeID() + " " + employees[i].getSalary()+" "
                        + employees[i].getCompany()+" "+employees[i].getPosition());
            }
        }
    }
    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }

}
