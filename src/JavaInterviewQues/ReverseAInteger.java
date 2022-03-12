package JavaInterviewQues;

public class ReverseAInteger {

	public static void main(String[] args) {
		
//		String s = "NaveenAutomation";
//		
//		int len = s.length();
//		String rev = " ";
//		
//		for(int i= len-1; i>=0; i-- ) {
//			
//			rev = rev + s.charAt(i);
//		}
//		
//		System.out.println(rev);
//
		
		int num = 123456789;
		int rev = 0;
		// int len = String.valueOf(num).length();
		
		// System.out.println(len);
		
		while (num != 0) {
			rev = rev * 10 + num % 10; //5
			num = num/10; //1234
		}
		
		System.out.println(rev);
		
		long num1 = 25896331;
		StringBuffer sf = new StringBuffer(String.valueOf(num1));
		System.out.println(sf.reverse());
		
	}
	
	//2. Using Stringbuffer
	
	


}
