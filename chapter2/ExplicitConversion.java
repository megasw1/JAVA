package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double d = 1.2;
			float f = 0.9f;
			
			int i = (int)d + (int)f;
			int i2= (int)(d+f);
			
			System.out.println(i+" "+i2);
	}

}
