package _1000;

import java.util.Scanner;

public class _1050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		int result = (a == b) ? 1 : 0;
//      System.out.println(result);
		
		if (a==b) 
			System.out.println(1);
		
		else 
			System.out.println(0);
		

        sc.close();
	}

}


