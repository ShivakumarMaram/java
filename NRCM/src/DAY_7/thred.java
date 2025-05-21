package DAY_7;

public class thred extends Thread {

	public static void main(String[] args)throws InterruptedException {
		Thread th=new Thread();
		thred t1=new thred();
		thred t2=new thred();
		t1.start();
		
		System.out.println("hiii");
		t1.sleep(2000);
	System.out.println("hello");
	System.out.println(t1.getName());
	System.out.println(t1.getState());
//		System.out.println(t1.getState());

	}

}
