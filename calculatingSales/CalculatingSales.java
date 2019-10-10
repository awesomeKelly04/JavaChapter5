package calculatingSales;

import java.util.Scanner;

public class CalculatingSales {
	private static Scanner value;
	
	public double calculateTotalSales() {
		double totalSales = 0;
		int productNumber = 0;
		int quantitySold;
		value = new Scanner(System.in);
		while (productNumber != -1) {
			System.out.print("Enter product number between 1 and 5 or -1 to exit: ");
			productNumber = value.nextInt();
			if (productNumber != -1) {
				System.out.print("Enter quantity sold: ");
				quantitySold = value.nextInt();
				totalSales += getSales(productNumber, quantitySold);
			}
		}
		return totalSales;
	}
	
	public double getSales(int productNumber, int quantitySold) {
		double sales = 0;
		
		switch(productNumber) {
			case 1:
				//Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
				sales = 2.98 * quantitySold;
				break;
			case 2:
				sales = 4.50 * quantitySold;
				break;
			case 3:
				sales = 9.98 * quantitySold;
				break;
			case 4:
				sales = 4.49 * quantitySold;
				break;
			case 5:
				sales = 6.87 * quantitySold;
				break;
			default:
				break;

		}
		
		return sales;
	}

}
