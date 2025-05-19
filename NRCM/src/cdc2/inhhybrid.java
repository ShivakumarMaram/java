package cdc2;
 class mobiles {
	 void comapny(){
		 System.out.println("samsung");
	 }
 }
 class model extends mobiles{
	 void vamshi() {
		 System.out.println("oneplus");
	 }
 }
 
 class thalaivaa extends model{
	 void goutham() {
		 System.out.println("samsung A15");
	 }
 }
 class shiva extends model{
	 void kumar() {
		 System.out.println("s23");
		 
	 }
 }
 public class inhhybrid{
	 public static void main(String[] args) {
		 thalaivaa g1=new thalaivaa();
		 shiva s1=new shiva();
		 
		 g1.goutham();
		 s1.kumar();
		 s1.vamshi();
		 g1.comapny();
		 
	 }
	 
 }
 