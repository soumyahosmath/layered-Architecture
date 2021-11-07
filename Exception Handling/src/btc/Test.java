package btc;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 20;
		System.out.println("Enter the age");
		try {
			age = sc.nextInt();
		    }
		catch(InputMismatchException e) {
			System.out.println("The values entered does not match");
		}
		System.out.println("User age:"+age);

	}

}
