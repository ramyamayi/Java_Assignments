package Classes_Objects;

public class Student_Main {

	public static void main(String[] args) {
		Student s1= new Student("Rama");
		Student s2= new Student("Ramya");
		Student s3= new Student("Sony");
		Student s4= new Student();
		Student s5= new Student();
		Student s6= new Student("Prav");
		System.out.println("Student names: ");
		Student[] stud_arr = {s1,s2,s3,s4,s5,s6};
		for(Student s:stud_arr) {
			System.out.println(s.getName());
		}
		
	}

}
