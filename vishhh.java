import java.util.Scanner;
 
public class Leap_Ex1 {
 
	int year;
	Scanner scan;
	
	void check() {
		
		System.out.println("Check leap year or not");
 
		System.out.println("\nEnter the year : ");
		scan = new Scanner(System.in);
		
		year = Integer.parseInt(scan.nextLine());
		
		if(year%400 == 0 || year%4 == 0) 
			System.out.println(year + " is a leap year");

		else 
			System.out.println(year + " is not a leap year");
	}
}
 
class MainClass {
	
	public static void main(String str[]) {
		
		Leap_Ex1 obj = new Leap_Ex1();
		
		obj.check();
	}
}
