package test;

import java.util.Scanner;

public class ExceptionTest {

	
	public static void main(String[] args) {
		
		try {
			inputF();			
		}catch(NumberFormatException e) {
			e.printStackTrace();
			inputF();
		}

	}
	
	static void inputF() throws NumberFormatException{
		
		
		String a = "123";
		String c = "12a";
		int b = Integer.valueOf(a);
		System.out.println(b);
		
		int d = Integer.valueOf(c);
		
		System.out.println("안녕하세요");
		
	}
}
