package OOP4;

public class Main {

	public static void main(String[] args) {
		Teacher Maria = new Teacher();
		Maria.setNome("Maria");
		Maria.setCpf("12345678910");
		Maria.setSalario(1200.00);

		Developer Marta = new Developer();
		Marta.setNome("Marta");
		Marta.setCpf("34567891011");
		Marta.setSalario(2000.00);

		System.out.printf("%s's salary without increase: $ %.2f\n", Maria.getNome(), Maria.getSalario());
		Maria.bonus();
		System.out.printf("%s's salary with increase: $ %.2f\n", Maria.getNome(), Maria.getSalario());

		System.out.printf("%s's salary without increase: $ %.2f\n", Marta.getNome(), Marta.getSalario());
		Marta.bonus();
		System.out.printf("%s's salary with increase: $ %.2f\n", Marta.getNome(), Marta.getSalario());
	}

}
