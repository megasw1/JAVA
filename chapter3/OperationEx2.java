package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int gameScore = 150;
			//변수 앞 증가연산자는 대입연산자보다 먼저 수행된다
			int lastScore = ++gameScore;
			System.out.println(lastScore);
			gameScore--;
			//증가연산자가 변수 뒤에 있으면 대입연산자 후 값이 증가한다
			int lastScore2 = gameScore++;
			System.out.println(lastScore2);
			
			
	}

}
