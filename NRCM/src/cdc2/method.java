package cdc2;

public class method {
	void show() {
		System.out.println("good morning");
	}
	void show(int a,int b) {
		System.out.println(a+b);
		
	}
	void show(double c,double d) {
		System.out.println(c-d);
	}
	void show(String a,String b ) {
		System.out.println(a.concat(b));
	}
	public static void main(String[] args) {
		method m1=new method();
		m1.show();
		m1.show(10, 20);
		m1.show(20.12, 10.63);
		m1.show("shiva","kumar");
		
	}

}

