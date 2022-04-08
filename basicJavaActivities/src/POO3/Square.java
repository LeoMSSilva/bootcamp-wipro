package POO3;

public class Square implements GeometricShapesInterface {
	private final int quantityOfsides = 2;
	private String color;

	public Square(String color) {
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
		return Math.pow(a, 2);
	}
}
