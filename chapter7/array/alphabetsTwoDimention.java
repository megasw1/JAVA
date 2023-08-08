package array;

public class alphabetsTwoDimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] alphabet = new char[13][2];
		char a = 'a';
				
				for(int i=0;i<alphabet.length;i++) {
					for(int j=0; j<alphabet[i].length ;j++) {
						alphabet[i][j] = a++;
						System.out.print(alphabet[i][j]+ " ");
					}
					System.out.println();
				}
		
	}

}
