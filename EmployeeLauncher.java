
public class EmployeeLauncher {

	public static void main(String[] args) {
		Employee person1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee person2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
		Employee person3 = new Employee("Joy Rogers", 81774, "Manufactoring", "Engineer");
		
		System.out.println("Name: " + person1.getName());
		System.out.println("Id Number: " + person1.getIdNumber());
		System.out.println("Department: " + person1.getDepartment());
		System.out.println("Position: " + person1.getPosition());
		System.out.println();
		System.out.println("Name: " + person2.getName());
		System.out.println("Id Number: " + person2.getIdNumber());
		System.out.println("Department: " + person2.getDepartment());
		System.out.println("Position: " + person2.getPosition());
		System.out.println();
		System.out.println("Name: " + person3.getName());
		System.out.println("Id Number: " + person3.getIdNumber());
		System.out.println("Department: " + person3.getDepartment());
		System.out.println("Position: " + person3.getPosition());
	}

}
