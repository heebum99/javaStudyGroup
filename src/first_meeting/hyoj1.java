package first_meeting;

import java.util.Random;
import java.util.Scanner;

// 프로그램이 가지고 있는 정수를 사용자가 알아맞추는 게임

public class hyoj1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int pro_num = random.nextInt(100)+1; //프로그램이 가지고 있는 정수를 1~100까지 난수로 생성,
        System.out.print("프로그램이 가지고 있는 정수를 알아 맞추세요 (1~100) : ");

        int cnt = 0; //시도 횟수

        while(true){
            cnt++;
            int input_num = scanner.nextInt();

            if(input_num > pro_num){
                System.out.println(input_num + " 보다 작습니다.");
            }
            else if(input_num < pro_num){
                System.out.println(input_num + " 보다 큽니다.");
            }
            else{
                System.out.println("축하합니다. 시도횟수 = " + cnt);
                break;
            }
        }

    }
}
