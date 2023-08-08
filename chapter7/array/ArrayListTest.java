package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥","조정래"));
		library.add(new Book("데미안","헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가","유시민"));
		library.add(new Book("토지","박경리"));
		library.add(new Book("어린왕자","생뗵쥐페리"));
		
		for(Book book : library) {
			
			book.showBookInfo();
		}
		System.out.println();
	}

}
