package DAY_1;

 
	abstract class demo10 {
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
	
	class shiva1 extends demo10{
		public void add() {
			System.out.println("hi");
		
		

	}
		void play() {
			System.out.println("hello");
		}
	}
	
	public class cal1{
		public static void main(String[] args) {
		shiva1 t1=new shiva1();
				t1.add();
				demo10.sub();
				demo10.mul();
				t1.div();
				t1.mod();
				t1.play();
	}
	}


