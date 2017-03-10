
public class personalInfo {
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	
	public personalInfo(String Name, int Age, String Address, String PhoneNumber) {
		this.name = Name;
		this.age = Age;
		this.address = Address;
		this.phoneNumber = PhoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
