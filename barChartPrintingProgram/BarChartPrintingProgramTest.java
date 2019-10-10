package barChartPrintingProgram;

import java.util.Scanner;

public class BarChartPrintingProgramTest {

	private static Scanner value;

	public static void main(String[] args) {
		value = new Scanner(System.in);
		BarChartPrintingProgram obj = new BarChartPrintingProgram();
		System.out.print("Enter first number between 1 and 30: ");
		int num1 = value.nextInt();
		System.out.print("Enter second number between 1 and 30: ");
		int num2 = value.nextInt();
		System.out.print("Enter third number between 1 and 30: ");
		int num3 = value.nextInt();
		System.out.print("Enter forth number between 1 and 30: ");
		int num4 = value.nextInt();
		System.out.print("Enter fifth number between 1 and 30: ");
		int num5 = value.nextInt();
		
		System.out.println();
		
		obj.printChart(num1);
		obj.printChart(num2);
		obj.printChart(num3);
		obj.printChart(num4);
		obj.printChart(num5);

	}

}
