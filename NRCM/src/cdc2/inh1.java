package cdc2;
class Animal{
	void sleep() {
		System.out.println("sleeping");
	}
}
class dog extends Animal{
	void bark(){
		System.out.println("barking");
	}
}
public class inh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      dog d1=new dog();
      d1.bark();
      d1.sleep();
	}

}
