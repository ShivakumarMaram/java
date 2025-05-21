package DAY_7;

//
//	import java.util.InputMismatchException;
//import java.util.Scanner;
//	public class execp2 {
//
//	
//		public static void main(String[] args) throws ArithmeticException,InputMismatchException  {
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter a,b values");
//		try {
//				int a=sc.nextInt();
//				int b=sc.nextInt();
//				int c=a/b;
//				System.out.println(c);
//		
//	}catch (ArithmeticException e) {
//		System.out.println();
//	}
//		}
//	
//
//
//	
//	}

//import java.util.InputMismatchException;
//import java.util.Scanner;
//public class execp2 {
//
//
//	void add() throws ArithmeticException,InputMismatchException  {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a,b values");
//	
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			int c=a/b;
//			System.out.println(c);
//	
//}
//public static void main(String[] args) {
//	execp2 e1=new execp2();
//	e1.add();
//	}
//
//
//
//
//}



public class execp2 {


	static void add(int a,int b) throws ArithmeticException,InputMismatchException  {
		
		System.out.println("enter a,b values");
	
			
	
}
public static void main(String[] args) {
	
	try {
		
	
 add(10,0);
	}catch (ArithmeticException e) {
		System.out.println(e.getLocalizedMessage());
	}
}
		
	}




}