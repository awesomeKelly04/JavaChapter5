package calculatingTheValueofPI;

public class CalculatingTheValueofPI {
	
	public void getPI() {
		int check = 0;
		int count = 0;
		double constant = 4;
		double PI = 0.0;
		int j = 1;		
		System.out.println("Number of Term\tPI");		
		for(int i = 1; i <= 200_000; i++) {
			count++;	
			
			PI = extracted(count, constant, PI, j);
									
			if(PI%3.141590 < 0.000001 || PI%3.141590 > 0.000009) {
				check++;
			}
			
			j+=2;
		}		
		System.out.println();
		System.out.printf("It was %d number of terms before PI become 3.14159%n", check);
	}

	private double extracted(int count, double constant, double PI, int j) {
		if(count%2 == 1) {
			PI += constant/(double)j;
			System.out.printf("%d\t\t%f%n", count, PI);
		}
		else {
			PI -= constant/(double)j;
			System.out.printf("%d\t\t%f%n", count, PI);
		}
		return PI;
	}

}
