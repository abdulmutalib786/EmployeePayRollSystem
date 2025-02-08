package emp.payroll;

import java.util.ArrayList;

public class PayRollSystem {
	private ArrayList<Employee> employeeList;

	PayRollSystem() {
		employeeList = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	public void removeEmployee(int id) {
		Employee removeEmployee = null;
		for (Employee employee : employeeList) {
			if (employee.getId() == id) {
				removeEmployee = employee;
				break;
			}
		}

		if (removeEmployee != null) {
			employeeList.remove(removeEmployee);
		}
	}

	public void displayEmployees() {
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}
