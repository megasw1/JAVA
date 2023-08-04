package chapter5;

public class Person {
	int age;
	String name;
	boolean ismarried;
	int child;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setName("James");
		person.setAge(40);
		person.setIsmarried(true);
		person.setChild(3);
		System.out.println("이름 : " + person.getName());
		System.out.println("나이 : " + person.getAge());
		System.out.println("결혼여부 : "+ person.getIsmarried());
		System.out.println("자녀  수 : " + person.getChild());
	
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getIsmarried() {
		return ismarried;
	}
	public void setIsmarried(boolean ismarried) {
		this.ismarried = ismarried;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	
}
