package Classes_Objects;

class Complex {
	private final double real;
	private final double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex sum(Complex other) {
		double r = this.real + other.real;
		double i = this.imaginary + other.imaginary;
		return new Complex(r, i);
	}

	public Complex difference(Complex other) {
		double r = this.real - other.real;
		double i = this.imaginary - other.imaginary;
		return new Complex(r, i);
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	@Override
	public String toString() {
		return real + " + " + imaginary + "i";
	}
}
