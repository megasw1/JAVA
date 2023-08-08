package array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> std = new ArrayList<Student>();
		
		std.add(new Student("1001","james"));
		std.add(new Student("1002","tomas"));
		std.add(new Student("1003","edward"));
		
		for(Student a : std) {
			a.showStudentInfo();
		}
	}

}
