package DAY_1;

abstract class demo6 {
	abstract void add();
}
class test3 extends demo6{
	
public void add() {
	System.out.println("hi");
}

public static void main() {
	test3 t1=new test3();
			t1.add();
}
}
