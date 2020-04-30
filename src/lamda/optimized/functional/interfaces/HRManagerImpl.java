package lamda.optimized.functional.interfaces;

import java.util.function.Consumer;

import lamda.Employee;

public class HRManagerImpl implements Consumer<Employee> {

	@Override
	public void accept(Employee employee) {

		System.out.println("Granting promotion to employee: " + employee.getName());

	}

}
