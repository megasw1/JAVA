package chapter4;

public class forExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i =1;i<=10;i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 "+ sum);
		
		
		//for문 다른 형식
		int i =1;
		sum =0;
		for(;;) {
			if(i>=10)  break; //조건식 . 무한반복인 for문을 멈추기 위해 조건이 10이상 
			i += 1; //증감식
			sum += 1; // for 본문
		}
	}

}
