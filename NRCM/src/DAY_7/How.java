package DAY_7;

//public class How implements Runnable{
// public void run() {
//	 System.out.println("hi");
// }
//	public static void main(String[] args) {
//	How h1=new How();
//	Thread t1=new Thread(h1);
//	System.out.println("hello");
//		t1.start();
//
//	}
//
//}
public class How implements Runnable{
	 public void run() {
		 System.out.println("hi");
	 }
		public static void main(String[] args) {
		How h1=new How();
//	How h2=new How();
		Thread t1=new Thread(h1);
		Thread t2=new Thread(h1);
		System.out.println("hello");
			t1.start();
			t2.start();

		}

	}
