package lamda.optimized;

import lamda.Employee;

public class EmployeeEvaluatorImpl implements EmployeeEvaluator {

	@Override
	public int evaluateEmployee(Employee employee) {

		int marks = interviewEmployee(employee);

		return marks;
	}

	private int interviewEmployee(Employee employee) {

		System.out.println("Interviewing employee :" + employee.getName());
		return 82;
	}

}
