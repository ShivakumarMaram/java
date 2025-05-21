package DAY_7;
import java.util.*;

public class excep {
	public static void main(String[] args) throws ArithmeticException  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values");
	try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
	
}catch (ArithmeticException e) {
	System.out.println();
}
	}
}
