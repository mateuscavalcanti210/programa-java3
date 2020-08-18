package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee;
import model.entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<Employee>();
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char result = sc.next().charAt(0);
			sc.nextLine();
			if (result == 'y') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee addemployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employee.add(addemployee);
			}
			else if (result == 'n') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				Employee addemployee = new Employee(name, hours, valuePerHour);
				employee.add(addemployee);
			}
			else {
				System.out.println("It's just 'y' or 'n'");
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee x : employee) {
			System.out.println(x);
		}
		
		sc.close();
		
	}
}