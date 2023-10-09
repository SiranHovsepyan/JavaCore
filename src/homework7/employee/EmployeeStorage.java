package homework7.employee;

import classwork.library.Book;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void search(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().contains(employeeID)) {
                print();
            }
        }
    }


    public void deletebyID(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeID)) {
                employees[i] = employees[i + 1];
            }
        }
        size--;
    }


    public Employee changebyID(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(employeeID)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchEmployee(String companyName) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(companyName)) {
                print();
            }
        }
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }

}
