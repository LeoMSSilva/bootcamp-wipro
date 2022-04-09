package OOP4;

public class Developer extends Employee {
	@Override
	public void bonus() {
		salario = salario + salario * 0.5;
	}
}
