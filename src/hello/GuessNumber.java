package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumber {
	
	public static void main(String[]args)throws IOException{
		//TODO Auto-generated method stub
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		int number;
		int guessnumber;
		int i=1;
		boolean flag = true;
		System.out.println("please input the number:");
		number = Integer.parseInt(stdIn.readLine());
		System.out.println("please input your guess number:");
		guessnumber = Integer.parseInt(stdIn.readLine());
		while(flag) {
			i++;
			if(number > guessnumber) {
				System.out.println("small");
			}else if(number < guessnumber) {
				System.out.println("big");
			}else {
				System.out.println("correct!");
				flag=false;
			System.out.println(i);
			}
		}
	}
}
//循环了我靠