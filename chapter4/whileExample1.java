package chapter4;

public class whileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1 ;
		int sum =0 ;
		
		while(num <=10) {
			sum += num;
			num++;
		}
		System.out.println("1 부터 10까지 합은 "  + sum);
	}

}
