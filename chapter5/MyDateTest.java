package chapter5;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date = new MyDate();
		//date.month = 2; 변수가 private로 선언하였기에 이 코드는 오류이지만
		//date.day 31;		밑의 get,set은 public 선언으로 함수를 호출할 수 있다.
		//date.year = 2018;
		
	
		System.out.println(date.IsVaild(32, 3) ? "가능 날짜" : "불가능 날짜");
		
	}

}
