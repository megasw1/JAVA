package chapter2;

public class bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num1 = 5;
			int num2 = 10;
			/* 비트연산 
			 *    0101   =  5(10)
			 *  & 1010   =  10(10)
			 *    0000   =  0(10)  2진수 and 연산 결과
			 */
			int result = num1 & num2;
			System.out.println(result);
			
			result = num1 | num2;  // or 연산 결과 : 15
			System.out.println(result);
			
			result = num1 ^ num2;  //xor연산 : 같은 자리 수의 값이 같으면 1출력 , 다르면 0
			System.out.println(result);
			
			result = ~num1; //반전연산자  음수로 만듬
			System.out.println(result);	
			
			 result = num1 << 1; //이동연산자 비트 이동방향에 2^n승 씩 상승
			System.out.println(result);	
			
	}

}
