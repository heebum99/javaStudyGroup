package first_meeting;

import java.util.Scanner;

//양수 5개 입력받아 배열에 저장, 제일 큰 수를 출력하라
//0~100사이의 값 5개 입력받고 저장하되 음수나 100이 넘는 경우 무시.
//입력된 값 중 가장 작은 수와 몇 번째 입력한 수가 가장 작은 수인지 출력.

public class hb1 {
    public static void main(String[] args) {
        System.out.println("2018314009 김희범");
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[5]; // 크기가 5인 배열 생성
        int min=100; // 최솟값
        int num=0; //몇 번째 수 인지

        System.out.println("양수 5개를 입력하세요.");

        for(int i=0; i<5; i++) {
            intArray[i] = scanner.nextInt(); // 입력받은 정수를 배열에 저장

            if(intArray[i]<0 || intArray[i]>100) { //음수거나 100이상이면 무시
                i--;
                continue;
            }

            if(intArray[i] < min) { // intArray[i]가 현재 가장 큰 수보다 크면
                min = intArray[i]; // intArray[i]를 max로 변경
                num = i+1;
            }
        }

        System.out.print("가장 작은 수는 " + min + "이고 "+ (num)+"번째 입력한 수가 가장 작은 수 입니다.");

        scanner.close();
    }
}
