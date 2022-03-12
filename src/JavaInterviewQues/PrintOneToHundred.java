package JavaInterviewQues;

public class PrintOneToHundred {

	public static void main(String[] args) {
		
		int num = 1;
		
//		while(num<=100){
//			
//			System.out.println(num);
//			
//			num = num+1;
//		}

		int one = 'A'/'A'; //1
		String s1 = "..........";
		
		for(int i = one; i<=(s1.length()*s1.length()); i++) {
			System.out.println(i);
		}
		
		//ASCII value : a =97, b= 98, c= 99, d= 100
		for(int i =one;i<='d'; i+=one) {
			System.out.println(i);
		}
	}

}
