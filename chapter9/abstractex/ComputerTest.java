package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//Computer c1 = new Computer(); //추상클래스는 불러 올 수 없다.추상은 주로 상속에 사용됨
			Computer c2 = new DeskTop();  //내용을 모두 구현했기에 추상클래스가 아니게 되었다.
		//	Computer c3 = new NoteBook();
			Computer c4 = new MyNoteBook();
			c2.display();
		
	}

}
