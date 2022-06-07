package Classes_Objects;

public class Complex_Main {

	public static void main(String[] args) {
		Complex c1 = new Complex(2, 4);
		Complex c2 = new Complex(3, 5);
		Complex sum = c1.sum(c2);
		Complex difference = c1.difference(c2);
		System.out.println("first complex number: " + c1);
		System.out.println("second complex number: " + c2);
		System.out.println("sum of two complex numbers: " + sum);
		System.out.println("difference of two complex numbers: " + difference);
	}

}




