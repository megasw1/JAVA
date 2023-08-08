package practice;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dog> dog = new ArrayList<Dog>();
		dog.add(new Dog("aa", "말티즈"));
		dog.add(new Dog("bb", "푸들"));
		dog.add(new Dog("cc", "포메라니안"));
		dog.add(new Dog("dd", "치와와"));
		dog.add(new Dog("ee", "진돗개"));	
		
		
		for(int i =0; i<dog.size(); i++) {
			System.out.println(dog.get(i).showDogInfo());
		}
		
		for(Dog d : dog) {
			System.out.println(d.showDogInfo());
		}

	}

}
