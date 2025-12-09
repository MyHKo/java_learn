package collections;
import java.util.*;
import java.util.stream.Collectors;

public class Exercises {
	public static void main(String[] args) {
		List<Employee> workers = Arrays.asList(
				new Employee("Alice", "IT", 75000),
	            new Employee("Bob", "HR", 50000),
	            new Employee("Charlie", "IT", 80000),
	            new Employee("David", "Sales", 45000),
	            new Employee("Eve", "Sales", 90000),
	            new Employee("Frank", "IT", 75000)
	            );
		
		
		List<String> it= workers.stream().filter(e -> e.getDepartment()
				.equals("IT")).map(e -> e.getName().toUpperCase()).collect(Collectors.toList());
	
		System.out.println(it);
		
		System.out.println(workers.stream().map(e -> e.getSalary()).reduce((double) 0, (subtotal,e) -> subtotal + e));
	}
}
