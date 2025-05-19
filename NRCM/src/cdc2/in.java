package cdc2;
interface t1{
	void add();
}
interface t2
{
void sub();
}


public class in  implements t1,t2{
	public void add() {
		System.out.println("hiii");
	}

	public void sub() {
		System.out.println("helloo");
		}
	public static void main(String[] args) {
		in i1=new in();
		i1.add();
		i1.sub();
		}
}
