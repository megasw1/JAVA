package chapter4;

import java.util.Scanner;

public class ifExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int charge;
		
		if(age<8) {
			charge = 1000; 
			System.out.println("취학전 아동입니다");
		}
		else if(age<14) {
			charge = 2000;
			System.out.println("초등학생");
		}
		else if(age<20) {
			charge = 2500;
			System.out.println("중,고등학생");
		}
		else  {
			System.out.println("성인");
		}
	}

}
