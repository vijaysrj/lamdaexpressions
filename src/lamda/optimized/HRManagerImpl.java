package lamda.optimized;

import lamda.Employee;

public class HRManagerImpl implements HRManager {

	@Override
	public void grantPromotion(Employee employee) {

		System.out.println("Granting promotion to employee: " + employee.getName());

	}

}
