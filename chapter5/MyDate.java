package chapter5;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		
	}
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean IsVaild(int day,int month) {
		boolean b = true;
	
		if(month <1 || month >12) {
			System.out.println("1~12의 값을 입력하세요"); b= false;
		}else {
			this.month = month;
		}
		if(month == 2) {
			if(day <1 || day >28) {
				System.out.println("오류"); b= false;
			}
		}	
			else if(month == 4 || month == 6 || month == 9 || month == 11) {
			if(day <1 || day >30) {
				System.out.println("오류"); b= false;
			}	
			}
		///////		
			else  {
			if(day <1 || day >31) {
				System.out.println("오류"); b= false;
			}
			}
		return b;
	}
		
	
	public void setMonth(int month) {
		if(month <1 || month >12) {
			System.out.println("1~12의 값을 입력하세요");
		}else {
			this.month = month;
		}
	}
	
	
	public void setDay(int day) {
		if(month == 2) {
			if(day <1 || day >28) {
				System.out.println("오류");
			}
			else {
				this.day = day;}
			}
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getDay() {
		return day;
	}


	public int getMonth() {
		return month;
	}
	
	
	
}
