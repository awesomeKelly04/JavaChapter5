package factorial;

public class Factorial {

	public void getFactorial() {
		System.out.println("Number\t\tFactorial");
		for(int i = 1; i <= 20; i++) {
			long number = i;
			if (number > 1) {
				long result = number;
				while (number > 1) {
					result *= (number-- - 1);
				} 				
				System.out.printf("%d\t\t\t%d%n", i, result);
			}
			else {
				System.out.printf("%d\t\t\t%d%n", i, number);
			}
		}
	}
}
