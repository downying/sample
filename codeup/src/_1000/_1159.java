package _1000;

import java.util.Scanner;

public class _1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if((n >= 50 && n <= 70) || (n % 6 == 0))
			System.out.println("win");
		else
			System.out.println("lose");
		
		sc.close();
	}

}
