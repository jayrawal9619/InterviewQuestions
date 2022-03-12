package JavaInterviewQues;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		
		int x = -100;
		int y = 50;
		int z = -50;
		
		if(x>y && x>z ) {
			System.out.println(" x is greater than y");
		} else if(y>z) {
			System.out.println("y is greater than z");
		} else if(z>x) {
			System.out.println("z is greater than x");
		} else {
			System.out.println("illogical code");
		}

	}

}
