package _1000;

import java.util.Scanner;

public class _1503 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][N];

        // 배열 초기화
        int num = 1;
        for (int i = 0; i < N; i++) {
            // 짝수 행인 경우
            if (i % 2 == 0) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = num++;
                }
            } else { // 홀수 행인 경우
                for (int j = N - 1; j >= 0; j--) {
                    arr[i][j] = num++;
                }
            }
        }

        // 배열 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
