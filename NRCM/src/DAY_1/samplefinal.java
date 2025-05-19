package DAY_1;


public class samplefinal {
	
		void show() {
			final int a=23;
			System.out.println(a);
			a=34;
			System.out.println(a);
		}
		public static void main(String[] args) {
			samplefinal s1=new samplefinal();
			s1.show();
		}
			
		}