package cdc2;
class car{
	void rajesh()
	{
		System.out.println("cars are fast");
		
	}
}
class suv extends car{
	void shiva() {
		System.out.println("suv's are bold");
	}
}
class swedan extends car{
	void vamshi() {
		System.out.println("swedan's are fast");
	}
}
class defender extends suv{
	void me() {
		System.out.println("defender is strong");
	}
}
class thar extends suv{
	void you(){
		System.out.println("thar is from mahindra");
		
	}
}
class virtus extends swedan{
	void vir() {
		System.out.println("virtus is from volkswagan");
	}
}

class m5 extends swedan{
	void mm() {
		System.out.println("m5 is from bmw");
	}
}






public class inhhei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         defender d1=new defender();
         thar t1=new thar();
         virtus v1=new virtus();
         m5 m1=new m5();
        d1.shiva();
        d1.me();
       d1.rajesh();
       t1.you();
       v1.vir();
       v1.vamshi();
       m1.mm();
	}

}
