package chapter6;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		studentLee.setStudentName("이지원"); 
		System.out.println(studentLee.serialNum);
		studentLee.serialNum ++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		studentSon.serialNum ++;
		System.out.println(studentLee.serialNum);
		System.out.println(studentSon.serialNum);
		
	}

}
