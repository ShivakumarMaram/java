package cdc2;
interface T1{
	void add();
	void sub();
}

public class inter implements T1 {
	public void add(){
		System.out.println("hii");
	}
	public void sub() {
		System.out.println("helloo");
	}
	public static void main(String[] args) {
		inter i1=new inter();
		i1.add();
		i1.sub();
		
}

}
