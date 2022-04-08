package POO3;

public class Circle implements GeometricShapesInterface {
	private final int quantityOfsides = 0;
	private String color;

	public Circle(String color) {
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String color() {
		return this.color;
	};

	public int quantityOfsides() {
		return this.quantityOfsides;
	};

	@Override
	public double area(double a, double b) {
		return Math.PI * Math.pow(a, 2);
	}
}
