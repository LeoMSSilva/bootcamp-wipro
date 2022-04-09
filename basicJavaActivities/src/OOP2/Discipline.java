package OOP2;

public class Discipline {
	private int id;
	private String disciplineName;
	private double firstTestGrade;
	private double secondTestGrade;
	private double workNote;
	private double average;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDisciplineName() {
		return disciplineName;
	}

	public void setDisciplineName(String disciplineName) {
		this.disciplineName = disciplineName;
	}

	public double getFirstTestGrade() {
		return firstTestGrade;
	}

	public void setFirstTestGrade(double firstTestGrade) {
		this.firstTestGrade = firstTestGrade;
	}

	public double getSecondTestGrade() {
		return secondTestGrade;
	}

	public void setSecondTestGrade(double secondTestGrade) {
		this.secondTestGrade = secondTestGrade;
	}

	public double getWorkNote() {
		return workNote;
	}

	public void setWorkNote(double workNote) {
		this.workNote = workNote;
	}

	public double calculateWeightedAverage() {
		this.average = (firstTestGrade * 1.5 + secondTestGrade * 1.5 + workNote * 2) / 5;
		return this.average;
	}

	public String calculateSituation () {
		return ((this.average >= 7) ? "approved" : "in recovery");
	}
}
