package lamda.optimized;

import lamda.Employee;

public class ManagerOptimized {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void processPromotion(Employee employee, CheckPromotionCriteria promotionCriteria,
			EmployeeEvaluator evaluator, HRManager hrManager) {

		if (promotionCriteria.checkPromotionEligibility(employee)) {

			int marks = evaluator.evaluateEmployee(employee);

			if (marks > 80) {

				hrManager.grantPromotion(employee);
			}

		}

	}

}
