package practice;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] dog = new Dog[5];

		dog[0] = new Dog("aaa","111");
		dog[1] = new Dog("bbb","222");
		dog[2] = new Dog("ccc","333");
		dog[3] = new Dog("ddd","444");
		dog[4] = new Dog("eee","555");
		//for문
		for(int i=0;i<dog.length;i++) {
			System.out.println(dog[i].showDogInfo());
		}
		//향상된 for문
		for (Dog d : dog) {
			System.out.println(d.showDogInfo());
		}
	}

}
