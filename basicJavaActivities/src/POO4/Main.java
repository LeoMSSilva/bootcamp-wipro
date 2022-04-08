package POO4;

public class Main {

	public static void main(String[] args) {
		Teacher Maria = new Teacher();
		Maria.setNome("Maria");
		Maria.setCpf("12345678910");
		Maria.setSalario(1200);

		Developer Marta = new Developer();
		Marta.setNome("Marta");
		Marta.setCpf("21");
		Marta.setSalario(2000);

		System.out.printf("Salário de %s sem aumento: %.2f\n", Maria.getNome(), Maria.getSalario());
		Maria.bonus();
		System.out.printf("Salário de %s com aumento: %.2f\n", Maria.getNome(), Maria.getSalario());

		System.out.printf("Salário de %s sem aumento: %.2f\n", Marta.getNome(), Marta.getSalario());
		Marta.bonus();
		System.out.printf("Salário de %s com aumento: %.2f\n", Marta.getNome(), Marta.getSalario());
	}

}
