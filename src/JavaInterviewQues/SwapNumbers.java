package JavaInterviewQues;

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		System.out.println("before swapping");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		System.out.println("after swapping");
		
//		int temp;
//		temp = a;
//		a = b;
//		b = temp;
//		
		
		a = a-b;//-10
		b = a+b;//30
		a = b-a;//
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
