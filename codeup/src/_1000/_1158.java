package _1000;

import java.util.Scanner;

public class _1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if((n >= 30.0 && n <= 40.0) || (n >= 60.0 && n <= 70.0)) 
			System.out.println("win");
		else 
			System.out.println("lose");
		
		sc.close();
	}

}
