
public class WorkerLauncher {

	public static void main(String[] args) {
		Employee employee1 = new Employee("David", "807-L", "02/23/17");
		employee1.clockIn();
		System.out.println(employee1.toString());
		
		System.out.println();
		
		ProductionWorker worker1 = new ProductionWorker(1, 7.70);
		worker1.clockIn();
		System.out.println(worker1.toString());
		
		System.out.println();
		
		ShiftSupervisor person1 = new ShiftSupervisor();
		person1.setEmployeeName("David");
		person1.setEmployeeNumber("208-A");
		person1.setHireDate("2/28/17");
		person1.setAnnualSalary(1284931);
		person1.setProductionBonus(2000);
		
		System.out.println(person1.getEmployeeName());
		System.out.println(person1.getEmployeeNumber());
		System.out.println(person1.getHireDate());
		System.out.println(person1.getAnnualSalary());
		System.out.println(person1.getProductionBonus());
	}

}
