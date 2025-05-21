package DAY_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Software {
	public static void main(String[] args) throws ArithmeticException,InputMismatchException  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values");
		
		
	try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
	
}catch (ArithmeticException  | InputMismatchException e){
	System.out.println(e.getMessage());
}
	}
}
