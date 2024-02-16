package Day04;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N 입력받고, 
		// 둘째 줄에 N 개의 정수를 공백을 두고 입력받으시오.
		// N 개의 정수 중, 최댓값을 출력하시오.
		// (입력예시)
		// 5	
		// 90 60 70 100 55
		// (출력예시)
		// 최솟값 : 55
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int N = sc.nextInt();
		int arr[] = new int[N];
		int min = Integer.MAX_VALUE;
		
		System.out.print("배열 정수 입력 : ");
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			// 5. 배열 arr 을 반복하여, 최댓값 변수 max와 i번째 배열요소를 비교한다.
			if( min > arr[i] ) {
				// 6. 두 요소 중 더 큰 요소를 max 에 대입한다.
				min = arr[i];
			}
		}
		
		System.out.println("최솟값 : " + min);
		
		
		
		
		
		// 입력과 최솟값 비교를 동시에 할 수 있다.
		System.out.print("정수 입력 : ");
		int A = sc.nextInt();
		
		int arr2[] = new int[A];
		
		int minimum = Integer.MAX_VALUE;
		System.out.print("배열 정수 입력 : ");
		for (int j = 0; j < A; j++) {
			arr2[j] = sc.nextInt();
			if( minimum > arr2[j] ) {
				minimum = arr2[j];
			}
		}
		
		System.out.println("minimum : " + minimum);
		
		sc.close();
	}

}
