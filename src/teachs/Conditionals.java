package teachs;
import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		System.out.println(num);
		boolean val = input.nextBoolean();
		double decimal = input.nextDouble();
//		String name = input.nextLine();
		String name2 = input.next();
		
		
		/* ---- BOOLEAN OPERATORS ----
		 * < Less than
		 * > Greater than
		 * >= Greater than or equal to
		 * <= Less than or equal to
		 * == equality
		 * != not equals to
		 * && And
		 * || Or
		 * ! not
		 */
		
		double price;
		price = input.nextDouble();
		
		if (price > 7) 
		{
			System.out.println("I AM NOT BUYING THAT!");
		} 
		else if (price == 0) 
		{
			System.out.println("WOW ITS FREE!");
		} 
		else {
			System.out.println("I guess I'll buy it");
		}
		
		String name;
		name = input.nextLine();
		
		if (!"austin".equals("Austin")) {
			
		}
		
		/*---- LOOPS ----
		 * While 
		 * Do while
		 * For
		*/
//		int i = 0;
//		while (i <= 5) {
//			System.out.println(i);
//			i++;
//		}
//		
		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j < 5);
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}
}
