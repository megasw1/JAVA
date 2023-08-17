package excrption;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoCloseObj obj = new AutoCloseObj();
		try (AutoCloseObj obj2 = obj){
			throw new Exception();  //강제 예외 발생
		}catch(Exception e) {
			System.out.println("예외부분입니다");
	}

}
}