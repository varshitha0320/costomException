package employeeManagement;
import java.util.Scanner;

abstract class Employee{
	private String name;
	private int employeeId;
	public Employee(String name,int employeeId)
	{
		this.name=name;
		this.employeeId=employeeId;
	}
	public String getName()
	{
		return name;
	}
	public int getEmployeeId()
	{
		return employeeId;
	}
	public abstract double calculateSalary();
	public abstract void displayDetails();
}
class FullTimeEmployee extends Employee{
	private double monthSalary;
	 public FullTimeEmployee(String name,int employeeId,double monthSalary)
	 {
		 super(name,employeeId);
		 this.monthSalary=monthSalary;
	 }
	 public double calculateSalary()
	 {
		 return monthSalary;
	 }
	 public void displayDetails()
	 {
		 System.out.println("FullTime Employee details: ");
		 System.out.println("Name: " + getName());
	     System.out.println("Employee ID: " + getEmployeeId());
	     System.out.println("Monthly Salary: " + calculateSalary());
	 }
}
class PartTimeEmployee extends Employee{
	private double hourlyRate;
	private int hourlyWorked;
	
	public PartTimeEmployee(String name,int employeeId,double hourlyRate,int hourlyWorked)
	{
		super(name,employeeId);
		this.hourlyRate=hourlyRate;
		this.hourlyWorked=hourlyWorked;
	}
	public double calculateSalary()
	{
		return hourlyWorked*hourlyRate;
	}
	public void displayDetails()
	 {
		 System.out.println("PartTime Employee details: ");
		 System.out.println("Name: " + getName());
	     System.out.println("Employee ID: " + getEmployeeId());
	     System.out.println("Hourly Rate: " + hourlyRate);
	     System.out.println("Hours Worked: " + hourlyWorked);
	     System.out.println("Total Salary: " + calculateSalary());
	 }	
}
public class EmployeeSystem {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter full-time employee details:");
        System.out.print("Name: ");
        String fullTimeName = scanner.nextLine();
        System.out.print("Employee ID: ");
        int fullTimeId = scanner.nextInt();
        System.out.print("Monthly Salary: ");
        double monthlySalary = scanner.nextDouble();
        scanner.nextLine();
        Employee fullTimeEmployee = new FullTimeEmployee(fullTimeName,fullTimeId,monthlySalary);

        System.out.println("Enter part-time employee details:");
        System.out.print("Name: ");
        String partTimeName = scanner.nextLine();
        System.out.print("Employee ID: ");
        int partTimeId = scanner.nextInt();
        System.out.print("Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Hours Worked: ");
        int hoursWorked = scanner.nextInt();

        Employee partTimeEmployee = new PartTimeEmployee(partTimeName, partTimeId, hourlyRate, hoursWorked);

        Employee[] employees = { fullTimeEmployee, partTimeEmployee };

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
	}
}
