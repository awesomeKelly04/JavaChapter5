package patterns;

public class Patterns {

	public void displayPatterns() {
		System.out.println("(a)");
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("(b)");
		for(int i = 10; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("(c)");
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if(j >= i) {
					System.out.print("*");					
				}
				else {					
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("(d)");
		for(int i = 1; i <= 10; i++) {
			for(int j = 10; j >= 1; j--) {
				if(j <= i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}
