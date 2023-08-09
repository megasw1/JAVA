package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		

		Customer customerKim = new VIPCustomer(10020, "김유신", 12345); //묵시적 클래스 변환
		customerKim.bonusPoint = 10000;
		
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() +" 님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원입니다.");
		System.out.println(customerKim.getCustomerName() +" 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원입니다.");
	}

}
