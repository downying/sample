package Day04;

import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N 입력받고, 
		// 둘째 줄에 N 개의 정수를 공백을 두고 입력받으시오.
		// N 개의 정수 중, 최댓값을 출력하시오.
		// (입력예시)
		// 5
		// 90 60 70 100 55
		// (출력예시)
		// 100
		/*
		  	(순서도)
		  	1. 정수 하나를 입력받는다.
		  	2. 입력받은 정수를 변수 N에 대입한다.
		  	3. N번 반복하여 N개의 정수를 입력받는다.
		  	4. 입력받은 N개의 정수를 배열 arr 에 저장한다.
		  	5. 배열 arr 을 반복하여, 최댓값 변수 max와 i번째 배열요소를 비교한다.
		 	6. 두 요소 중 더 큰 요소를 max 에 대입한다.
		 	7. 반복이 끝나고, 변수 max 를 출력한다.		 	
		 */
		
		// 1. 정수 하나를 입력받는다.
		// 2. 입력받은 정수를 변수 N에 대입한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int N = sc.nextInt();	// 입력받을 데이터 개수
		int arr[] = new int[N];
		
		int max = Integer.MIN_VALUE; 	// int 타입의 최솟값 : -21억xxx
		
		// 3. N번 반복하여 N개의 정수를 입력받는다.
	  	// 4. 입력받은 N개의 정수를 배열 arr 에 저장한다.
		// 반복변수 i : 0,1,2,3,4
		System.out.print("배열 정수 입력 : ");
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			// 5. 배열 arr 을 반복하여, 최댓값 변수 max와 i번째 배열요소를 비교한다.
			if( max < arr[i] ) {
				// 6. 두 요소 중 더 큰 요소를 max 에 대입한다.
				max = arr[i];
			}
		}
		
		// 7. 반복이 끝나고, 변수 max 를 출력한다.		 	
		System.out.println("최댓값 : " + max);
		
		
		
		
		
		System.out.print("정수 입력 : ");
		int A = sc.nextInt();
		
		int arr2[] = new int[A];
		
		int maximum = Integer.MIN_VALUE;
		System.out.print("배열 정수 입력 : ");
		for (int j = 0; j < A; j++) {
			arr2[j] = sc.nextInt();
			if( maximum < arr2[j] ) {
				maximum = arr2[j];
			}
		}
		
		System.out.println("maximum : " + maximum);
		
		sc.close();
		
	}

}

