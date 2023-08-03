package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num = 10;
			int i = 2;
			//and 연산자에서 앞 내용이 거짓이면 뒷내용은 실행하지 않는다
			//or은 뒤까지 봐도 결과 값을 알 수있기 때문에 앞이 거짓이라도 뒤 실행
			boolean value = ((num+=1) < 10) && ((i+=2)  <10);
			System.out.println(num+" "+i+" "+value);
			
	}

}
