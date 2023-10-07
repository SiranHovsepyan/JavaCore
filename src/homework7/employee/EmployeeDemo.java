package homework7.employee;

import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    printAllEmployee();
                    break;
                case "3":
                    searchByEmployeeID();
                    break;
                case "4":
                    searchByCompany();
                    break;
                case "5":
                    deleteByEmployeeID();
                    break;
                case "6":
                    changeByEmployeeID();
                    break;
                default:
                    System.out.println("Incorrect command!!!!!!");
            }
        }
    }

    private static void changeByEmployeeID() {
        System.out.println("Please input employeeID for change data`s ");
        String employeeID = scanner.nextLine();
        employeeStorage.changebyID(employeeID);
        System.out.println("If you want to change the name please input 1");
        System.out.println("if you want to change the surname please input 2");
        System.out.println("if you want to change the salary please input 3");
        System.out.println("if you want to change the company name please input 4");
        System.out.println("if you want to change the position in company please input 5");
        String command = scanner.nextLine();
        switch (command) {
            case "1":
                System.out.println("Please input employee name for change");
                String name = scanner.nextLine();
                employeeStorage.changebyID(name);
                break;
            case "2":
                System.out.println("Please input employee surname for change");
                String surname = scanner.nextLine();
                employeeStorage.changebyID(surname);
                break;
            case "3":
                System.out.println("Please input size of the salary for change");
                double salary = Double.parseDouble(scanner.nextLine());
                employeeStorage.changebyID(String.valueOf(salary));
                break;
            case "4":
                System.out.println("Please input name of the company for change");
                String company = scanner.nextLine();
                employeeStorage.changebyID(company);
                break;
            case "5":
                System.out.println("Please input the position in company for change");
                String position = scanner.nextLine();
                employeeStorage.changebyID(position);
                break;
            default:
                System.out.println("Incorrect command!!!!!!");
        }
    }

    private static void deleteByEmployeeID() {
        String employeeID = scanner.nextLine();
        employeeStorage.deletebyID(employeeID);
        System.out.println("Employee with ID: " + employeeID + " is deleted!");
    }

    private static void searchByCompany() {
        String companyName = scanner.nextLine();
        employeeStorage.searchEmployee(companyName);
    }

    private static void searchByEmployeeID() {
        String employeeID = scanner.nextLine();
        employeeStorage.search(employeeID);
    }

    private static void printAllEmployee() {
        employeeStorage.print();
    }

    private static void addEmployee() {
        System.out.println("Please input employee name");
        String name = scanner.nextLine();
        System.out.println("Please input employee surname");
        String surname = scanner.nextLine();
        System.out.println("Please input employeeID");
        String employeeID = scanner.nextLine();
        System.out.println("Please input size of the salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input name of the company");
        String company = scanner.nextLine();
        System.out.println("Please input the position in company");
        String position = scanner.nextLine();
        Employee employee = new Employee(name, surname, employeeID, salary, company, position);
        employeeStorage.add(employee);
        System.out.println("Employee created!!!");
    }

    public static void printCommands() {
        System.out.println("Please input 0 for Exit");
        System.out.println("Please input 1 for add new employee");
        System.out.println("Please input 2 for print all employee");
        System.out.println("Please input 3 for search employee by employee ID");
        System.out.println("Please input 4 for search employee by company name");
        System.out.println("Please input 5 for delete employee by employeeID");
        System.out.println("Please input 6 for change employee by employeeID");
    }


}
