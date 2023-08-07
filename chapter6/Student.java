package chapter6;

public class Student {
	public static int serialNum = 1000;  //static은 첫 선언시 주소를 할당함.따라서 여러 변수 중 하나의 값만 증가하여도 나머지도 증가
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return  studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
}
