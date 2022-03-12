package JavaInterviewQues;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		
		char ch = 'a';
		
		//1) Using if method
		
		if(ch == 'a' || ch =='e' || ch =='o' || ch =='i' || ch =='u') {
			System.out.println(ch + " is vowel");
		} else {
			System.out.println(ch + " is consonent");
		}
		
		//2)Using switch method
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");
			break;
			
			default:
				System.out.println(ch + " is consonent");
		
		}
	}

}
