package emp.payroll;

public class Main {
	public static void main(String[] args) {
		PayRollSystem payRollSystem = new PayRollSystem();
		FullTimeEmployee emp1 = new FullTimeEmployee("Abdul", 1, 3000000);
		PartTimeEmployee emp2 = new PartTimeEmployee("Fortuner", 2, 40, 5000);

		payRollSystem.addEmployee(emp1);
		payRollSystem.addEmployee(emp2);
		System.out.println("Initial Employee Details: ");
		payRollSystem.displayEmployees();
		payRollSystem.removeEmployee(2);
		System.out.println("Details after removing an employee: ");
		payRollSystem.displayEmployees();
	}
}
