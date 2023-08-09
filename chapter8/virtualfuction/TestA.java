package virtualfuction;

public class TestA {

	
		int num;

		void aaa(){
			System.out.println("aaa() 출력");
		}
		
		public static void main(String[] args){
				// testA 클래스의 변수  num 클래스가 생성될 때 마다 추가로 생성되지만
			//메서드 aaa는 하나로 호출될때마다 같음
			TestA a1 = new TestA();
			a1.aaa();
			
			TestA a2 = new TestA();
			a2.aaa();
		
	}

}
