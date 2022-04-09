package OOP4;

public class Teacher extends Employee {
	@Override
	public void bonus() {
		salario = salario + salario * 0.1;
	}
}
