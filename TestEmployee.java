public class TestEmployee {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(01, "John", "Patrick", 4500);
		Employee employee2 = new Employee(employee1);

		System.out.println(employee2.toString());
		System.out.println("John's salary is: $" + employee2.getAnnualSalary());
		System.out.println("Employee count: " + Employee.count);
		employee2.raiseSalary(20);
		System.out.println("John's salary after 20% raise is: " + employee2.getAnnualSalary());

		Employee employee3 = new Employee(02, "James", "Woodley", 5000);
		Employee employee4 = new Employee(employee3);

		System.out.println(employee4.toString());
		System.out.println("John's salary is: $" + employee4.getAnnualSalary());
		System.out.println("Employee count: " + Employee.count);
		employee4.raiseSalary(20);
		System.out.println("John's salary after 20% raise is: " + employee4.getAnnualSalary());

		
	}
}
