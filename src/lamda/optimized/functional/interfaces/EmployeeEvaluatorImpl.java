package lamda.optimized.functional.interfaces;

import java.util.function.Function;

import lamda.Employee;

public class EmployeeEvaluatorImpl implements Function<Employee, Integer> {

	@Override
	public Integer apply(Employee employee) {

		int marks = interviewEmployee(employee);

		return marks;
	}

	private int interviewEmployee(Employee employee) {

		System.out.println("Interviewing employee: " + employee.getName());
		return 83;
	}

}
