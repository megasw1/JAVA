package practice;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		for(int i=1 ; i<=10 ; i++) {
			if(i%2 ==0) {
				arr[i/2-1] =i;
			}
		}
		int sum=0;
		for(int i=0;i<5 ;i++) {
			sum += arr[i];
			System.out.print(arr[i]+",");
		}
		System.out.println("sum =" + sum);
	}

}
