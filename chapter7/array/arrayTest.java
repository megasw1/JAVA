package array;

public class arrayTest {
	public static void main (String[] args) {
	int[] num = new int[] {1,2,3,4,5,6,7,8,9};
	
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
	}
		
	int[] num2 = new int[10];
	
	for(int i=0;i<num2.length;i++) {
		num2[i] = i+1;
		System.out.println(num2[i]);
	}
		
	}
}
 