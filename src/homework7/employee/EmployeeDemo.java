package homework7.employee;

import classwork.library.Book;
import classwork.library.BookStorage;


import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for Exit");
            System.out.println("Please input 1 for add new employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please input 3 for search employee by employee ID");
            System.out.println("Please input 4 for search employee by company name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input employee name");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employeeID");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input size of the sallary");
                    double sallary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input name of the company");
                    String company = scanner.nextLine();
                    System.out.println("Please input the position in company");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeID, sallary, company, position);
                    employeeStorage.add(employee);
                    System.out.println("Employee created!!!");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    String employid = scanner.nextLine();
                    employeeStorage.search(employid);
                    break;
                case "4":
                    String companyName = scanner.nextLine();
                    employeeStorage.searchEmployee(companyName);
                    break;
                default:
                    System.out.println("Incorrect command!!!!!!");

            }
        }
    }
}
