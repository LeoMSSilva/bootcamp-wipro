package POO3;

public class RectangleTriangle implements GeometricShapesInterface {
	private final int quantityOfsides = 3;
	private String color;

	public RectangleTriangle(String color) {
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
		return (a * b) / 2;
	}
}
