package DAY_7;
//import java .io.*;
//public class Creation {
//
//	public static void main(String[] args) throws IOException{
//		File f1=new File("C:\\Users\\SHIVA-KUMAR\\OneDrive\\Desktop\\sem");
//		if(f1.createNewFile()) {
//			System.out.println("file created");
//		}else {
//			System.out.println("file not created");
//		}
//		
//
//	}
//
//}
import java .io.*;
public class Creation {

	public static void main(String[] args) throws IOException{
		FileWriter f1=new FileWriter("C:\\Users\\SHIVA-KUMAR\\OneDrive\\Desktop\\sem.txt");
		f1.write("mgg");
		f1.close();
		System.out.println("success");
		

	}

}
