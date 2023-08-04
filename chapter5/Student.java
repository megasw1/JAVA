package chapter5;

public class Student {
	 int StudentID;
	String StudentName;
	int grade;
	String adress;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student studentAhn = new Student();
	studentAhn.StudentName = "안연수";
	studentAhn.setStudentName("안연수");
	System.out.println(studentAhn.StudentName);
	System.out.println(studentAhn.getStudentName());
		studentAhn.showStudentInfo();
	}
	
	
	public void showStudentInfo() {
		System.out.println(StudentName + "," + adress);
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String name) {
		StudentName = name;
	}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

}
