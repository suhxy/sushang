package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class name {

	public static void main(String[]args)throws IOException{
	//TODO Auto-generated method stub
	BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Hello,what is your name?");
	System.out.print("name");
	String str = stdIn.readLine();
	System.out.println("hello"+str+",nice to meet you");
	str = stdIn.readLine();
	System.out.println("How old are you?");
	str = stdIn.readLine();
	System.out.println("nice!you are"+ str + "years old");
			
		}

	}
		


