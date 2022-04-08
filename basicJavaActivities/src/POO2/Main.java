package POO2;

public class Main {

	public static void main(String[] args) {
		Discipline discipline = new Discipline();
		discipline.setId(1);
		discipline.setDisciplineName("OOP");

		Student student = new Student();
		student.setName("Leonardo");
		student.setRegistration(1234);
		student.setDiscipline(discipline);
		student.getDiscipline().setFirstTestGrade(10);
		student.getDiscipline().setSecondTestGrade(8);
		student.getDiscipline().setWorkNote(5);

		System.out.printf("The %s student with average %.2f is %s in discipline %s.\n", 
				student.getName(),
				student.getDiscipline().calculateWeightedAverage(),
				student.getDiscipline().calculateSituation(),
				student.getDiscipline().getDisciplineName());
	}
}
