package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();

		//int number = 0;
				
		//int item = scan.nextInt();
		
		String[] type = new String[count];

		double[] totalprice = new double[count];
		
		// for loop for the first part, the list
		for(int i=0; i<count; i++) {
			type[i] = scan.next();
			totalprice[i] = scan.nextDouble();

		}
		
			int iter = scan.nextInt();
			String[] firstnames = new String[count];
			String[] lastnames = new String[count];
			Double[] total = new Double[iter];
			
			for(int zero = 0; zero < iter; zero++) {
				total[zero] = 0.0;
			}
			
			//going through for each person
			for (int f = 0; f < iter; f++) { 
				firstnames[f] = scan.next();
				lastnames[f] = scan.next();
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
					total[f] += totalprice[index] * quantity;		//equation to determine the cost of each person's shopping trip
				}
			}
			
			int big=0;
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
			System.out.println("Average: " + String.format("%.2f", (sum/total.length)));
		}
	}
