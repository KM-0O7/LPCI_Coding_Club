package teachs;
import java.util.Scanner;

public class ShortShoppingList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many items do you want?");
		int items = sc.nextInt();
		
		for (int i = 0; i < items; i++) {
			System.out.println("What is the price of your item?");
			double price = sc.nextDouble();
			System.out.println("What is the name of your item");
			String name = sc.next();
			
			System.out.println("Your item is " + name + " and it costs " + price);
			
		}
		
		System.out.println("----SHOPING LIST----");
	}

}
