package chapter5;

public class shoppingMall {
	private String orderNumber;
	private String ID;
	private String day;
	private String name;
	private String goodsNumber;
	private String adress;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	shoppingMall shop = new shoppingMall();
	shop.setOrderNumber("201803120001");
	shop.setID("abc123");
	shop.setDay("2018년 3월 12일");
	shop.setGoodsNumber("PD0345-12");
	shop.setName("홍길순");
	shop.setAdress("서울시 영등포구 여의도동 20번지");
	
	System.out.println("주문번호 : " + shop.getOrderNumber());
	System.out.println("아이디 : " + shop.getID());
	System.out.println("주문날짜 : " + shop.getDay());
	System.out.println("이름 : " + shop.getName());
	System.out.println("주문상품번호 : " + shop.getGoodsNumber());
	System.out.println("배송주소 : "  + shop.getAdress());
			
			
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGoodsNumber() {
		return goodsNumber;
	}

	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	

	
	
	
}