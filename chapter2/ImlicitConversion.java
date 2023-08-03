package chapter2;

public class ImlicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			byte b =10;
			int i = b;
			System.out.println(i+" "+b);
			
			int i2 = 20;
			float f = i2;
			System.out.println(i2+" "+f);
			
			double d = i+f;
			System.out.println(d);
	}

}
