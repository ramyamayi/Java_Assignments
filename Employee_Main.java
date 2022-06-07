package Classes_Objects;

public class Employee_Main {

	public static void main(String[] args) {
	Employee emp1 = new Employee("Robert",1994,"64C-Walls Strat");
	Employee emp2 = new Employee("Sam",2000,"68D-Walls Strat");
	Employee emp3 = new Employee("John",1999,"26B-Walls Strat");

	System.out.println("Name\tYear of joining\tAddress");
    System.out.println(emp1.getName()+"\t"+emp1.getYearOfJoining()+"\t\t"+emp1.getAddress());  
    System.out.println(emp2.getName()+"\t"+emp2.getYearOfJoining()+"\t\t"+emp2.getAddress());  
    System.out.println(emp3.getName()+"\t"+emp3.getYearOfJoining()+"\t\t"+emp3.getAddress());
	}

}
