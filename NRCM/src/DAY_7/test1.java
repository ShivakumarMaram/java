package DAY_7;

 class test0 extends Thread{
	public void run() {
		System.out.println("good");
	}

}
class test2 extends test0{
	public void run() {
		System.out.println("morning");
	}
}
class test3 implements Runnable{
	public void run(){
		System.out.println("to");
	}
}
class test4 extends test3{
	public void run() {
		System.out.println("you");
	}
}
	public class test1{
		
	public static void main(String[] args) {
		test0 t0=new test0();
		test2 t2=new test2();
		test3 t3=new test3();
		test4 t4=new test4();
		t0.start();
		t2.start();
		Thread p1=new Thread(t3);
		p1.start();
		Thread p2=new Thread(t4);
		p2.start();
		
		
		
	}
}
