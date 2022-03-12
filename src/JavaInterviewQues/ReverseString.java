package JavaInterviewQues;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Selenium";
		//String is a immutable object
		//There is no reverse method/function in String 
		
		//1.) Using for loop
		int len = s.length(); //8
		String rev = " ";
		
		
		for(int i = len-1; i>=0; i--) {
			rev = rev + s.charAt(i); // muineleS
			
		}
	
		System.out.println(rev);
	
		//2.) Using StringBuffer sf = new StringBuffer(s);
		// StringBuffer is mutable class
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
	}

}

