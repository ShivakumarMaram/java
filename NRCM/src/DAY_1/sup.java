package DAY_1;
class vamshi10{
	public vamshi10() {
		System.out.println("mg");
	}
	int x=90;
	void print() {
		System.out.println("hello");
	}
}

public class sup extends vamshi10 {
	public sup() {
		
		super();
	}
	void show() {
		int y=20;
		super.print();
		System.out.println(super.x);
        System.out.println(y);
}



public static void main(String[] args) {
	sup s1=new sup();
	s1.show();
}
}
	

