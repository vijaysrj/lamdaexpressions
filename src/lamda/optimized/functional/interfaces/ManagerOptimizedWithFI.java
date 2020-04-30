package lamda.optimized.functional.interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import lamda.Employee;

public class ManagerOptimizedWithFI {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void processPromotion(Employee employee, Predicate<Employee> promotionCriteria,
			Function<Employee, Integer> evaluator, Consumer<Employee> hrManager) {

		if (promotionCriteria.test(employee)) {

			int marks = evaluator.apply(employee);

			if (marks > 80) {

				hrManager.accept(employee);
			}

		}

	}

}
