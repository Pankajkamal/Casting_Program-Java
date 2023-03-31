/*Narrowing casting convert large type to smaller type size*/
public class narrowingCasting {
	public static void main(String[]args) {
		double myDouble = 10.78;
		int myInt = (int)myDouble;
		System.out.println(myDouble); // Output is 10.78
		System.out.println("Manual casting: double to int");
		System.out.println(myInt); // Output is 10
		
	}
}
