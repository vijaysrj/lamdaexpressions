package lamda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import lamda.optimized.CheckPromotionCriteria;
import lamda.optimized.CheckPromotionCriteriaImpl;
import lamda.optimized.EmployeeEvaluator;
import lamda.optimized.EmployeeEvaluatorImpl;
import lamda.optimized.HRManager;
import lamda.optimized.HRManagerImpl;
import lamda.optimized.ManagerOptimized;
import lamda.optimized.functional.interfaces.ManagerOptimizedWithFI;

public class Client {

	public static void main(String a[]) {

		Employee employee = new Employee("Kumar", 4, "Java, Spring, AWS", 11, 4);

		// Approach 1: Using the tightly coupled code

		System.out.println("Approach 1: Using tightly coupled code ");
		Manager manager = new Manager();
		manager.setName("Rahul");
		manager.processPromotion(employee);

		// Approach 2: Using loose coupling by separating each step of granting
		// promotion and
		// delegating them to a different class

		System.out.println("Approach 2 : Delegation promotion steps implementations to different classes");
		ManagerOptimized managerOptimized = new ManagerOptimized();
		managerOptimized.setName("The Better Rahul");

		CheckPromotionCriteria promotionCriteria = new CheckPromotionCriteriaImpl();
		EmployeeEvaluator evaluator = new EmployeeEvaluatorImpl();
		HRManager hrManager = new HRManagerImpl();

		managerOptimized.processPromotion(employee, promotionCriteria, evaluator, hrManager);

		// Approach 3 : An enhancement over the previous approach.
		// Using inbuilt functional interfaces provided by Java instead of creating new
		// ones.

		System.out.println(
				"Approach 3: Using inbuilt functional interfaces instead of custom interfaces for the promotion steps");
		ManagerOptimizedWithFI managerFI = new ManagerOptimizedWithFI();
		managerFI.setName("The Even Better Rahul");

		Predicate<Employee> promotionCriteriaPredicate = new lamda.optimized.functional.interfaces.CheckPromotionCriteriaImpl();

		Function<Employee, Integer> evaluatorFunction = new lamda.optimized.functional.interfaces.EmployeeEvaluatorImpl();

		Consumer<Employee> hrManagerConsumer = new lamda.optimized.functional.interfaces.HRManagerImpl();

		managerFI.processPromotion(employee, promotionCriteriaPredicate, evaluatorFunction, hrManagerConsumer);

		// Approach 4: Use lamda expressions as parameters instead of
		// predicate/function/consumer class implementations.

		System.out.println(
				"Approach 4: Using lamda expressions instead of custom classes for implementing promotion steps");

		Predicate<Employee> promotionCriteriaLamda = e -> e.getSkillSet().contains("Java")
				&& e.getExperienceInCompany() > 3 && e.getTotalExperience() > 10;

		Function<Employee, Integer> evaluatorLamda = e -> {
			System.out.println("Interviewing employee: " + employee.getName());
			return 82;
		};

		Consumer<Employee> hrManagerLamda = e -> System.out
				.println("Granting promotion to employee: " + employee.getName());

		managerFI.processPromotion(employee, promotionCriteriaLamda, evaluatorLamda, hrManagerLamda);

		// Approach 5 : Directly passing the lamda expressions as arguments :

		System.out.println("Approach 5: Same as approach 4 , just the lamda expressions are passed directly ");
		managerFI.processPromotion(employee,
				e -> e.getSkillSet().contains("Java") && e.getExperienceInCompany() > 3 && e.getTotalExperience() > 10,
				e -> {
					System.out.println("Interviewing employee: " + employee.getName());
					return 82;
				}, e -> System.out.println("Granting promotion to employee: " + employee.getName()));

	}
}
