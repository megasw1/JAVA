package chapter4;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ranking = 1;
		char medalColor=' ';
		switch(ranking) {
		
		case 1:medalColor = 'G'; break;
		case 2:medalColor = 'S'; break;
		case 3:medalColor = 'B'; break;
		case 4:medalColor = 'A'; 
		}
		System.out.println(ranking + "등 메달의 색깔 : " + medalColor);
	}

}
