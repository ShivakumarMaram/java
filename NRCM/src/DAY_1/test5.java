package DAY_1;

public class test5 {
	int x;
	int y;

	public test5(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x=y);
	}
	public test5(test5 t1) {
		this.x=t1.x;
		this.y=t1.y;
		System.out.println(x-y);
		
	}
	public static void main(String [] args) {
		test5 t1=new test5(45,23);
		test5 t2=new test5(t1);
	}
	
}
		