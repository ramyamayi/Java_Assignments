package Classes_Objects;

public class Rectangle_main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3,4);
		Rectangle r3 = new Rectangle(5);
		System.out.println("Area of rectangle: "+ r1.getArea());
		System.out.println("Area of rectangle: "+r2.getArea());
		System.out.println("Area of rectangle: "+r3.getArea());
		

	}

}
