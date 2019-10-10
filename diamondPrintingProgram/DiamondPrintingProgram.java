package diamondPrintingProgram;

public class DiamondPrintingProgram {
	
	public void printDiamond(int oddNumber) {
		System.out.println();
		for(int i = 1; i <= oddNumber+1; i+=2) {
			for (int k = 1; k <= (oddNumber-i)/2; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i = oddNumber-2; i >= 1; i-=2) {
			for (int k = 1; k <= (oddNumber-i)/2; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
