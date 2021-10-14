package edu.wit.cs.comp1000;
import java.util.Scanner; 
/*
 * Writing a banner with rotated letters 
 * @author Hector Padilla 
 * @date October 31 2019 
 */


// TODO: document this class
public class PA5a {
public static void d(){
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("*     *%n");
	System.out.printf("*     *%n");
	System.out.printf(" *   * %n");
	System.out.printf("  ***  %n");
	System.out.printf("%n");
}
public static void e(){
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("*  *  *%n");
	System.out.printf("*  *  *%n");
	System.out.printf("*  *  *%n");
	System.out.printf("*  *  *%n");
	System.out.printf("%n");
}
public static void h(){
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("   *   %n");
	System.out.printf("   *   %n");
	System.out.printf("   *   %n");
	System.out.printf("*******%n");
	System.out.printf("%n");
}
public static void l(){
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("*      %n");
	System.out.printf("*      %n");
	System.out.printf("*      %n");
	System.out.printf("*      %n");
	System.out.printf("%n");
}
public static void o(){
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("*     *%n");
	System.out.printf("*     *%n");
	System.out.printf("*     *%n");
	System.out.printf("*******%n");
	System.out.printf("%n");
}
public static void r(){
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("   *  *%n");
	System.out.printf("  **  *%n");
	System.out.printf(" * ****%n");
	System.out.printf("*      %n");
	System.out.printf("%n");
}
public static void w(){
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("*      %n");
	System.out.printf("****   %n");
	System.out.printf("*      %n");
	System.out.printf("*******%n");
	System.out.printf("%n");
}
public static void blank() {
	System.out.printf("%n%n%n");
}

	// TODO: document this method
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner scnr = new Scanner(System.in);
		System.out.print("Input message: ");
		String inputMsg = scnr.nextLine();
		
		char d = 'd';
		char e = 'e';
		char h = 'h';
		char l = 'l';
		char r = 'r';
		char o = 'o';
		char w = 'w';
		
		int i; 
		for (i = 0; i < inputMsg.length(); ++i) {
			if (Character.isLetter(inputMsg.charAt(i))) {
			}
			if ((inputMsg.charAt(i) == 'd') || (inputMsg.charAt(i) == 'D')) {
				d();
			}
			else if ((inputMsg.charAt(i) == 'e') || (inputMsg.charAt(i) == 'E')) {
				e();
			}
			else if ((inputMsg.charAt(i) == 'h') || (inputMsg.charAt(i) == 'H')) {
				h();
			}
			else if ((inputMsg.charAt(i) == 'l') || (inputMsg.charAt(i) == 'L')) {
				l();
			}
			else if ((inputMsg.charAt(i) == 'r') || (inputMsg.charAt(i) == 'R')) {
				r();
			}
			else if ((inputMsg.charAt(i) == 'o') || (inputMsg.charAt(i) == 'O')) {
				o();
			}
			else if ((inputMsg.charAt(i) == 'w') || (inputMsg.charAt(i) == 'W')) {
				w();
			}
			else if (inputMsg.charAt(i) == ' ') {
				blank();
			}
		}
		
		
		
		
		//nextLine(); 
		//Length();
		
		
	}

}
