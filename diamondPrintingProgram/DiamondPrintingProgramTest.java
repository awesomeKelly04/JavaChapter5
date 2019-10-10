package diamondPrintingProgram;

import java.util.Scanner;

public class DiamondPrintingProgramTest {

	private static Scanner read;

	public static void main(String[] args) {
		read = new Scanner(System.in);
		DiamondPrintingProgram obj = new DiamondPrintingProgram();
		
		System.out.print("Enter an odd number in the range 1 to 19: ");
		obj.printDiamond(read.nextInt());

	}

}
