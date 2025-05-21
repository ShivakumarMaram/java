package DAY_7;

public class test11 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if (i==5) 
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
	public static  void main(String[] args) {
		test11 t1=new test11();
		t1.start();
	}

}
