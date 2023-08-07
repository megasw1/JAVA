package chapter6;

public class CarFactory {
	private static CarFactory Instance = new CarFactory();
	private static int carNum = 10000;
	private CarFactory() {}
	
	
	
	
	public static CarFactory getInstance() {
		return Instance;
	}
	public static void setInstance(CarFactory instance) {
		Instance = instance;
	}
	public static int getCarNum() {
		return carNum;
	}
	public static void setCarNum(int carNum) {
		CarFactory.carNum = carNum;
	}
	
	public Car createCar() {
		Car car = new Car();
		carNum ++;
		car.setCarNum(carNum);
		return car;
	}
	


}
