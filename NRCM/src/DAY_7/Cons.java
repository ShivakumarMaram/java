package DAY_7;

public class Cons implements Runnable {
	public void run() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Thread t1=new Thread(new Cons());
		t1.start();
		
	}

}
