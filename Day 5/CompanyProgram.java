package day5;
public class CompanyProgram {
class Department {
    private String name;
    private double sales;
    private double expenses;
    // Constructor to initialize department details
    public Department(String name, double sales, double expenses) {
        this.name = name;
        this.sales = sales;
        this.expenses = expenses;
    }
    // Method to calculate and return the profit for this department
    public double getProfit() {
        return sales - expenses;
    }
    // Method to display department details
    public void displayDepartmentInfo() {
        System.out.println("Department: " + name);
        System.out.println("Sales: $" + sales);
        System.out.println("Expenses: $" + expenses);
        System.out.println("Profit: $" + getProfit());
        System.out.println("-------------------------------------");
    }
}
// Company class to hold multiple departments
class Company {
    private Department[] departments;
    private int departmentCount;
    // Constructor to initialize the company with a maximum number of departments
    public Company(int maxDepartments) {
        departments = new Department[maxDepartments];
        departmentCount = 0;
    }
    // Method to add a department to the company
    public void addDepartment(Department department) {
        if (departmentCount < departments.length) {
            departments[departmentCount] = department;
            departmentCount++;
        } else {
            System.out.println("Cannot add more departments.");
        }
    }
    // Method to calculate the total profit of the company
    public double getTotalProfit() {
        double totalProfit = 0;
        for (int i = 0; i < departmentCount; i++) {
            totalProfit += departments[i].getProfit();
        }
        return totalProfit;
    }
    // Method to display information about all departments
    public void displayAllDepartments() {
        System.out.println("Company Departments and Their Profits:");
        for (int i = 0; i < departmentCount; i++) {
            departments[i].displayDepartmentInfo();
        }
    }
}
public static void main(String[] args) {
    // Create an instance of CompanyProgram
    CompanyProgram companyProgram = new CompanyProgram();
    // Create a company with space for 3 departments
    Company company = companyProgram.new Company(3);
    // Create departments with some example data
    Department salesDepartment = companyProgram.new Department("Sales", 500000, 200000);
    Department hrDepartment = companyProgram.new Department("Human Resources", 200000, 150000);
    Department itDepartment = companyProgram.new Department("IT", 350000, 100000);
    // Add departments to the company
    company.addDepartment(salesDepartment);
    company.addDepartment(hrDepartment);
    company.addDepartment(itDepartment);
    // Display information about all departments
    company.displayAllDepartments();
    // Display the total profit for the company
    double totalProfit = company.getTotalProfit();
    System.out.println("Total Profit for the Company: $" + totalProfit);
}
}
