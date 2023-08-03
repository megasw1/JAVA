package chapter3;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//charpter3 Q1
	
		Q4();
		
	}
	public static void Q1() {
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge>25);
		System.out.println(value);
		

		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		char ch;
		ch = (myAge > teacherAge) ? 'T': 'F';
		
		System.out.println(ch);
	}
	public static void Q2() {
		int NUM;
		NUM = -5 +3 *10 /2;
		System.out.println(NUM);
	}
	public static void Q3() {
		int num = 10;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(--num);
		
	}
	public static void Q4() {
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) && (num2 > 10));
		System.out.println(result);
		result = ((num1 > 10) || (num2 > 10));
		System.out.println(result);
		System.out.println(!result);
				
	}
	public static void Q5() {
		int num1 =2;
		int num2 = 10;
	}
}
