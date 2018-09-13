import java.util.Scanner;

public class TelephoneNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your telephone number with no symbols: ");
		String telephoneNumber = scanner.nextLine();

		System.out.println("(" + telephoneNumber.substring(0,3) + ")-" + telephoneNumber.substring(3,6) + "-" + telephoneNumber.substring(6,10));
	}
}