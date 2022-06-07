package Classes_Objects;

public class Employee {

	private String name;
	private int yearOfJoining;
	private String address;

	public Employee(String name, int yearOfJoining, String address) {
	this.name=name;
	this.yearOfJoining= yearOfJoining;
	this.address= address;
	}

	public String getName() {
		return name;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [name= " + name + ", yearOfJoining " + yearOfJoining + ", address " + address + "]";
	}
	

}
