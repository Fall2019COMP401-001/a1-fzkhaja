package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		int count = scan.nextInt();
	

		String[] firstnames = new String[count];
		String[] lastnames = new String[count];

		double[] totalprice = new double[count];

		// for loop for the customers
		for (int i = 0; i < count; i++) {
			firstnames[i] = scan.next();
			lastnames[i] = scan.next();
			int item = scan.nextInt();
			
			//nested for loop, for the list
			for (int f = 0; f < item; f++) {
				int quantity = scan.nextInt();
				String itemtype = scan.next();
				double price = scan.nextDouble();
				
				totalprice[i] += quantity * price;
			}
			
		}
		// for loop ends
		for(int i = 0; i<count; i++) {
			System.out.println(firstnames[i].charAt(0)+". " + lastnames[i]+ ": " + String.format("%.2f",totalprice[i]));		
		}
		
	}
}
