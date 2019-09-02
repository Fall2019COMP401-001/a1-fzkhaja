package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();

		//int number = 0;
				
		//int item = scan.nextInt();
		
		String[] type = new String[count];

		// double[] totalprice = new double[count];
		
		// for loop for the first part, the list of ingredients
		for(int i=0; i<count; i++) {
			type[i] = scan.next();
			scan.nextDouble();
			// totalprice[i] = scan.nextDouble();

		}
		
			// iteration for each person
			int iter = scan.nextInt();
			int[] numberofcustomers = new int[count];
			int[] totalquantity = new int[count];
			  // String[] firstnames = new String[iter];
			  // String[] lastnames = new String[iter];
			  // Double[] total = new Double[iter];
			
			//going through for each person, including the number of ingredients each person got
			for (int f = 0; f < iter; f++) { 
				boolean [] customer = new boolean[count];
				scan.next();
				scan.next();
				int number = scan.nextInt();

				//going through each list (the ingredients)
				for(int g=0; g<number; g++) { 
					int quantity = scan.nextInt();
					String itemtype = scan.next();
					
					int index = 0;
					
					//checking for the index of the item
					for(int h=0; h<count; h++) { 
						if(itemtype.equals(type[h])) {
							index = h;
						}	
					}
					totalquantity[index] +=	quantity;
					if(!customer[index]) {
						numberofcustomers[index] += 1;
					}
					customer[index] = true;
				}
			}
			
			/*int big=0;
			int small=0;
			double sum=0;
			for(int x=0; x<total.length; x++) {
				if(total[x] > total[big]) {			//if statement: sets variable as big or small depending on the value
					big = x;
				}
				if(total[x] < total[small]) {
					small = x;
					 
				}
				sum += total[x];
			
			}
			System.out.println("Biggest: " + firstnames[big] + " " + lastnames[big] + " (" + String.format("%.2f", total[big]) + ")");
			System.out.println("Smallest: " + firstnames[small] + " " + lastnames[small] + " (" + String.format("%.2f", total[small]) + ")");
			System.out.println("Average: " + String.format("%.2f", (sum/total.length)));*/
			
			for(int x=0; x<count; x++) {
				if(numberofcustomers[x] > 0) {
				System.out.println(numberofcustomers[x] + " customers bought " + totalquantity[x] + " " + type[x]);
				} 
				
				else {System.out.println("No customers bought " + type[x]);
				}
			}
			
		}
	}
