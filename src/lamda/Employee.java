package lamda;

public class Employee {

	String name;

	private int experienceInCompany;

	private String skillSet;

	private int totalExperience;

	int rating;

	public Employee(String name, int experienceInCompany, String skillSet, int totalExperience, int rating) {

		this.name = name;
		this.setExperienceInCompany(experienceInCompany);
		this.setSkillSet(skillSet);
		this.setTotalExperience(totalExperience);
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public int getExperienceInCompany() {
		return experienceInCompany;
	}

	public void setExperienceInCompany(int experienceInCompany) {
		this.experienceInCompany = experienceInCompany;
	}

	public int getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}

}
