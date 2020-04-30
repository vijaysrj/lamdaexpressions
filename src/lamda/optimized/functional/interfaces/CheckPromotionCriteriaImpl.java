package lamda.optimized.functional.interfaces;

import java.util.function.Predicate;

import lamda.Employee;

public class CheckPromotionCriteriaImpl implements Predicate<Employee> {

	@Override
	public boolean test(Employee employee) {

		System.out.println("Checking eligibility criteria for employee: " + employee.getName());
		if (employee.getSkillSet().contains("Java") && employee.getExperienceInCompany() > 3
				&& employee.getTotalExperience() > 10) {

			return true;

		}

		return false;
	}

}
