package classwork.chapter8.employeemanagement;

import java.util.Scanner;

public class EmployeeManagementMain {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

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
                    addCompany();
                    break;
                case "2":
                    addEmployee();
                    break;
                case "3":
                    companyStorage.print();
                    break;
                case "4":
                    employeeStorage.print();
                    break;
                case "5":
                    searchEmployeeById();
                    break;
                case "6":
                    searchEmployeeByCompany();
                    break;
                case "7":
                    deleteCompany();
                    break;
                case "8":
                    deleteEmployee();
                    break;
                case "9":
                    changeCompany();
                    break;
                case "10":
                    changeEmployee();
                    break;
                default:
                    System.out.println("Invalid command.try again");
            }
        }
    }

    private static void changeEmployee() {
        System.out.println("please choose company id");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with" + companyId + "does not exists");
            return;
        }
        employeeStorage.searchEmployeeByCompany(companyFromStorage);
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Employee employeeFromStorage = employeeStorage.getById(employeeId);
        if (employeeFromStorage == null) {
            System.out.println("employee with" + employeeId + "does not exists");
            return;
        }
        System.out.println("please input employee new name");
        String employeeName = scanner.nextLine();
        System.out.println("please input employee new surname");
        String employeeSurname = scanner.nextLine();
        System.out.println("please input employee  phone");
        String employeePhone = scanner.nextLine();
        System.out.println("please input employee position");
        String employeePosition = scanner.nextLine();
        System.out.println("please input employee salary");
        double employeeSalary = Double.parseDouble(scanner.nextLine());
        employeeFromStorage.setName(employeeName);
        employeeFromStorage.setSurname(employeeSurname);
        employeeFromStorage.setPosition(employeePosition);
        employeeFromStorage.setSalary(employeeSalary);
        employeeFromStorage.setPhone(employeePhone);
        System.out.println("employee updated");

    }

    private static void changeCompany() {
        System.out.println("please input company id");
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with" + companyId + "does not exists");
            return;
        }
        System.out.println("please input new company name ");
        String companyName = scanner.nextLine();
        System.out.println("please input new company address");
        String companyAddress = scanner.nextLine();

        companyFromStorage.setName(companyName);
        companyFromStorage.setAddress(companyAddress);
        System.out.println("company updated");
    }

    private static void deleteEmployee() {
        System.out.println("please chosse company");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with" + companyId + "does not exists");
            return;
        }
        employeeStorage.searchEmployeeByCompany(companyFromStorage);

        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Employee employeeFromStorage = employeeStorage.getById(employeeId);
        if (employeeFromStorage == null) {
            System.out.println("employee with" + employeeId + "does not exists");
            return;
        }
        if (!employeeFromStorage.getCompany().equals(companyFromStorage)) {
            System.out.println("wrong employee id");
            return;
        }
        employeeStorage.deleteById(employeeId);
    }

    private static void deleteCompany() {
        System.out.println("please choose company");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with" + companyId + "does not exists");
            return;
        }
        companyStorage.deleteById(companyId);
    }

    private static void searchEmployeeByCompany() {
        System.out.println("please chosse company");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with" + companyId + "does not exists");
            return;
        }
        employeeStorage.searchEmployeeByCompany(companyFromStorage);

    }

    private static void searchEmployeeById() {
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Employee byId = employeeStorage.getById(employeeId);
        if (byId == null) {
            System.out.println("does not exists");
        } else {
            System.out.println(byId);
        }
    }

    private static void addCompany() {
        System.out.println("please input company id");
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage != null) {
            System.out.println("company with" + companyId + "already exists");
            return;
        }
        System.out.println("please input company name ");
        String companyName = scanner.nextLine();
        System.out.println("please input company address");
        String companyAddress = scanner.nextLine();
        Company company = new Company(companyId, companyName, companyAddress);
        companyStorage.add(company);
        System.out.println("company registered");
    }

    private static void addEmployee() {
        System.out.println("please chosse company");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with" + companyId + "does not exists");
            return;
        }
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Employee employeeFromStorage = employeeStorage.getById(employeeId);
        if (employeeFromStorage != null) {
            System.out.println("employee with" + employeeId + "already exists");
            return;
        }
        System.out.println("please input employee name");
        String employeeName = scanner.nextLine();
        System.out.println("please input employee surname");
        String employeeSurname = scanner.nextLine();
        System.out.println("please input employee phone");
        String employeePhone = scanner.nextLine();
        System.out.println("please input employee position");
        String employeePosition = scanner.nextLine();
        System.out.println("please input employee salary");
        double employeeSalary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(employeeId, employeeName, employeeSurname, employeePhone, employeeSalary, employeePosition, companyFromStorage);
        employeeStorage.add(employee);
        System.out.println("employee registered");
    }

    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add company");
        System.out.println("Please input 2 for add employee");
        System.out.println("Please input 3 for print all companies");
        System.out.println("Please input 4 for print all employees");
        System.out.println("Please input 5 for search employee by id");
        System.out.println("Please input 6 for search employee by company");
        System.out.println("Please input 7 for delete company ");
        System.out.println("Please input 8 for delete employee");
        System.out.println("Please input 9 for change company");
        System.out.println("Please input 10 for change employee");


    }
}
