package lamda.optimized;

import lamda.Employee;

public class CheckPromotionCriteriaImpl implements CheckPromotionCriteria {

	@Override
	public boolean checkPromotionEligibility(Employee employee) {

		System.out.println("Checking eligibility criteria for employee: " + employee.getName());

		if (employee.getSkillSet().contains("Java") && employee.getExperienceInCompany() > 3
				&& employee.getTotalExperience() > 10) {

			return true;

		}

		return false;
	}

}
