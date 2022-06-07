package Classes_Objects;

public class Rectangle {

	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Rectangle() {
		int length = 0;
		int breadth = 0;
	}
	public Rectangle(int length) {
		this.length = length;
		this.breadth = length;

	}
	public int getArea() {
		
		int area =this.length*this.breadth;
		return area;
	}
	

}
