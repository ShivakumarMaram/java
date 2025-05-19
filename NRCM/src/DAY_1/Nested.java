package DAY_1;

public class Nested {
	void show() {
		System.out.println("hiii");
	}
	class Inner{
		void print() {
			System.out.println("helloooo");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested n1=new Nested();
		n1.show();
        Nested.Inner i1=new Nested().new Inner();
        i1.print();
        	
       
        
	}

}
