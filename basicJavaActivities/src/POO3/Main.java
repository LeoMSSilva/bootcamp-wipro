package POO3;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("Azul");
		Rectangle rectangle = new Rectangle("Amarelo");
		Square square = new Square("Verde");
		RectangleTriangle rectangleTriangle = new RectangleTriangle("Vermelho");

		System.out.printf("Circle %s with %d sides, area = %.1f.\n", circle.color(), circle.quantityOfsides(),
				circle.area(10, 0));
		System.out.printf("Rectangle %s with %d sides, area = %.1f.\n", rectangle.color(),
				rectangle.quantityOfsides(), rectangle.area(10, 20));
		System.out.printf("Square %s with %d sides, area = %.1f.\n", square.color(), square.quantityOfsides(),
				square.area(10, 0));
		System.out.printf("Triangle %s with %d sides, area = %.1f.\n", rectangleTriangle.color(),
				rectangleTriangle.quantityOfsides(), rectangleTriangle.area(10, 20));
	}

}
