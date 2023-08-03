package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner s = new Scanner(System.in);
        String user = s.next();
        int randomNum = 0;
        
        Random r = new Random();
        randomNum = r.nextInt(3);
        String computer = "";
        
        if (randomNum == 0) {
        	computer = "묵";
        } else if (randomNum == 1) {
        	computer = "찌";
        } else {
        	computer = "빠";
        }

        if (user.equals(computer)) {
            System.out.println("컴퓨터가 낸 것은 " + computer + "로 비겼습니다");
        } else if (user.equals("묵") && computer.equals("찌")) {
            System.out.println("컴퓨터가 낸 것은 " + computer + "로 당신이 이겼습니다");
        } else if (user.equals("찌") && computer.equals("빠")) {
            System.out.println("컴퓨터가 낸 것은 " + computer + "로 당신이 이겼습니다");
        } else if (user.equals("빠") && computer.equals("묵")) {
            System.out.println("컴퓨터가 낸 것은 " + computer + "로 당신이 이겼습니다");
        } else {
            System.out.println("컴퓨터가 낸 것은 " + computer + "로 당신이 졌습니다");
        }
    }
}