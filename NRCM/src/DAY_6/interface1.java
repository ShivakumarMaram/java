package DAY_6;
interface I1
{
	void add() ;
}
interface I2{
	void sub();
}


public class interface1 implements I1,I2 {
	public void add() {
		System.out.println("hii");
	}
public void sub() {
	System.out.println("hello");
}
public static void main(String[] args) {
	interface1 i1=new interface1();
	i1.add();
	i1.sub();
	
}
}
