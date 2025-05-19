
package DAY_1
abstract class demo9 {
	abstract void add();
	static void sub()
	{
		System.out.println("dancing");
	}
	static void mul()
	{
		System.out.println("singing");
	}
	void div(){
		System.out.println("playing");
	}
	void mod(){
		System.out.println("drawing");
		
	}
}
class multi extends demo9{
	public void add() {
		System.out.println("hi");
	
	

}
	void play() {
		System.out.println("hello");
	}
class shiva1{
	

public static void main(String[] args) {
	multi t1=new multi();
			t1.add();
			demo9.sub();
			demo9.mul();
			t1.div();
			t1.mod();
			t1.play();
}
}
