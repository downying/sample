package _1000;

import java.util.Scanner;

public class _1226 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 로또 당첨번호와 보너스 번호 입력 받기
        int[] winNum = new int[6];
        for (int j = 0; j < 6; j++) {
            winNum[j] = sc.nextInt();
        }
        int bonusNum = sc.nextInt();

        // 지혜의 로또 번호 입력 받기
        int[] myNum = new int[6];
        for (int i = 0; i < 6; i++) {
            myNum[i] = sc.nextInt();
        }
        
        sc.close();
        
        // 지혜의 로또 번호와 당첨 번호를 비교하여 일치하는 개수 확인
        int numMatch = 0;
        for (int i : myNum) {
            for (int j : winNum) {
                if (i == j) {
                    numMatch++;
                    break;
                }
            }
        }
        
      // 보너스 번호 일치 여부 확인
       boolean bonusMatch = false;
       for (int i : myNum) {
           if (i == bonusNum) {
               bonusMatch = true;
               break;
           }
       }
       
    // 등수 판별
       int rank;
       switch (numMatch) {
           case 6:
               rank = 1;
               break;
           case 5:
               if (bonusMatch)
                   rank = 2;
               else
                   rank = 3;
               break;
           case 4:
               rank = 4;
               break;
           case 3:
               rank = 5;
               break;
           default:
               rank = 0;
               break;
       }
       
       // 등수 출력
       System.out.println(rank);
   }
        
}
