package DAY_10;


	
	import java.util.*;

	public class Softwaree {

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a,b values:");
			try {
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=a/b;
				System.out.println(c);
			}catch(ArithmeticException |InputMismatchException e) {
				System.out.println(e.getMessage());
			}

		}

	}



