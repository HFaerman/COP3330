import java.util.Scanner;

public class Faerman__p1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		char dec;
		int userInput;
		int a ;
		int b;
		int c;
		int d;
		
		System.out.println("Do you want to encrypt or decrypt a number? Enter e or d");
		
		dec = scnr.next().charAt(0);
		
		if (dec == 'e') {
			System.out.println("Enter a four digit number");
			
			userInput = scnr.nextInt();
			
			a = userInput / 1000;
			b = (userInput % 1000) / 100;
			c = (userInput % 100) / 10;
			d = userInput % 10;
			
			a = (a + 7) % 10;
			b = (b + 7) % 10;
			c = (c + 7) % 10;
			d = (d + 7) % 10;
			
			System.out.print(c);
			System.out.print(d);
			System.out.print(a);
			System.out.print(b);
		}
		else if (dec == 'd') {
			System.out.println("Enter a four digit decrypted number");
			
			userInput = scnr.nextInt();
			
			a = userInput / 1000;
			b = (userInput % 1000) / 100;
			c = (userInput % 100) / 10;
			d = userInput % 10;
			
			a = (a + 3) % 10;
			b = (b + 3) % 10;
			c = (c + 3) % 10;
			d = (d + 3) % 10;
			
			System.out.print(c);
			System.out.print(d);
			System.out.print(a);
			System.out.print(b);
		}
		else {
			System.out.println("That was not a valid code."	);
			
		}

			
		
		scnr.close();	
	}

}


