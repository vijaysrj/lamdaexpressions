package lamda;

public class Manager {

	String name;

	public void processPromotion(Employee employee) {

		System.out.println("Checking eligibility criteria for employee: " + employee.getName());

		if (employee.getSkillSet().contains("Java") && employee.getExperienceInCompany() > 3
				&& employee.getTotalExperience() > 10) {

			int marks = interviewEmployee(employee);

			if (marks > 80) {

				grantPromotion(employee);
			}

		}

	}

	private void grantPromotion(Employee employee) {

		System.out.println("Granting promotion to employee :" + employee.getName());

	}

	private int interviewEmployee(Employee employee) {

		// do interview

		System.out.println("Interviewing  employee :" + employee.getName());
		return 85;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
