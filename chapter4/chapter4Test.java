package chapter4;

import java.util.Scanner;

public class chapter4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Q2();
	}
	public static void Q1() {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		String operator = s.next();
		int result =0;
		
		if(operator.equals("+")) {
		result = num1 + num2;	
		}
		else if(operator.equals("-")) {
			result = num1 - num2;	
			}
		else if(operator.equals("*")) {
			result = num1 * num2;	
			}
		else if(operator.equals("/")) {
			result = num1 / num2;	
			}
		
		System.out.println(num1 +" "+ operator+" " + num2 +" = "+ result );
		s.close();
	}
	
	public static void Q2() {
	for(int dan =2;dan<=8;dan++) {
		if(dan %2 == 1) {
			continue;
		}
		for(int times =1;times<=9;times++) {
			System.out.println(dan + "X" + times + "=" +dan*times);
	
		}
	}
	}
	public static void Q3() {
		for(int dan =2;dan<=9;dan++) {			
			for(int times =1;times<=9;times++) {
					if(dan < times) {
						continue;
					}
				System.out.println(dan + "X" + times + "=" +dan*times);
		
			}
		}
		
		
	}
	public static void Q4() {
		
		 for(int i=0; i<4; i++)
		    {
		        for(int j=i; j<3; j++)
		        {
		            System.out.print(" ");
		        }
		        for(int j=0; j<=(i*2); j++)
		        {
		        	System.out.print("*");
		        }
		        System.out.println();

		    }
		
	}
	public static void Q5() {
		   
		    for(int i=0; i<4; i++)
		    {
		        for(int j=i; j<3; j++)
		        {
		            System.out.print(" ");
		        }
		        for(int j=0; j<=(i*2); j++)
		        {
		        	System.out.print("*");
		        }
		        System.out.println();

		    }

		    for(int i=2; i>=0; i--)
		    {
		        for(int j=i;j<3; j++)
		        {
		        	System.out.print(" ");
		        }
		        for(int j=0; j<=(i*2); j++)
		        {
		        	System.out.print("*");
		        }
		        System.out.println();

		    }
	

		
	}
	
	
	
}
