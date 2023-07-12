import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Tabuada");
		System.out.println("digite um numero:");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x;
		int y = 0;
		
		for (int i=1; i<11; i++) {
			y = (y + 1);
			x = (n * i);
			System.out.printf("%d x %d= %d %n", n, y, x);
		}
	
		
		sc.close();

	}

}
