package JavaInterviewQues;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = " !@#$%^&** latin string 0123456789";
		
		// Regular Expression: [^a-zA-Z0-9]
		
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}

}
