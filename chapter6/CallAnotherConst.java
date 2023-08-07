package chapter6;

class Person{
	String name;
	int age;
	
	Person(){
		this("이름없음", 1);
	}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	Person returnItSelf() {
		return this;  // 자신을  되돌려줄떄는 주소 값을 반환한다
	
	}
}



public class CallAnotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person noName = new Person("d",2);
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		}	

}
