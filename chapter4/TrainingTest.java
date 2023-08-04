package chapter4;

import java.util.Scanner;

public class TrainingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q6();
	}

	
	
	
	public static void Q1() {
		System.out.print("두 정수를 입력하세요:");
		Scanner s = new Scanner(System.in);
	int n1 = s.nextInt();
	int n2 = s.nextInt();
	System.out.println(n1 +n2);
		
	}
	
	public static void Q2() {
		System.out.print("몇 층인지 입력하세요: ");
		Scanner s = new Scanner(System.in);
	int n1 = s.nextInt();
	System.out.println("건물의 높이는 "+ (n1 * 5)+ "입니다");
	}
	
	
	public static void Q3() {
		System.out.print("x값을 입력하세요: ");
		Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	 System.out.println("x는"+x+"  y는"+ (x*x-3*x+7) );
	}
	
	public static void Q5() {
		System.out.print(" 논리연산자를 입력하세요: ");
		Scanner s = new Scanner(System.in);
		boolean a = s.nextBoolean(); // 첫 번째 논리 값 읽기
		String op = s.next(); // 논리 연산자(AND 또는 OR)를 문자열로 읽기
		boolean b = s.nextBoolean(); // 두 번째 논리 값 읽기
		switch(op) {
		 case "AND": System.out.println((a && b)?"true" : "false"); break;
		 case "OR" : System.out.println((a || b)?"true" : "false"); 
		}

	}
	
	public static void Q6() {
		System.out.print(" 돈의 액수를 입력하세요: ");
		Scanner s = new Scanner(System.in);
		int money = s.nextInt();
		
		int Oman = money / 50000;
		int man = money % 50000 / 10000;
		int cheon = money % 10000 / 1000; 
		int Oback = money % 1000 / 500; 
		int back =money % 1000 % 500 / 100; 
		int sip = money % 100 / 10;
		int eil = money % 10;
		System.out.println("오만원권 " + Oman +"개, 만원권 "+ man +"개, 천원권 "+ cheon +"개, 오백원권 "+ Oback +"개, 백원권 "+ back +"개, 십원권 "+ sip +"개, 일원권 "+ eil +"개");
	}
	
	public static void Q7() {
		System.out.print(" 학점을 입력하세요: ");
		Scanner s = new Scanner(System.in);
		String grade = s.next();
		
		switch(grade) {
		
		case "A": 
		case "B":System.out.println("EXCELLENT"); break;
		case "C": 
		case "D":System.out.println("GOOD"); break;
		case "F": System.out.println("BYE"); 
		}
		
		
	}
	public static void Q8() {
		System.out.print(" 커피를 입력하세요: ");
		Scanner s = new Scanner(System.in);
		String coffee = s.next();
		int count = s.nextInt();
		int price=0;
		
		switch(coffee) {
		case "에스프레소": price = 2000; break;
		case "아메리카노": price = 2500; break;
		case "카푸치노": price = 3000; break;
		case "카페라뗴": price = 3500; 
		}
		System.out.println((price * count)+"원 입니다");
		
	}
	
	
}
