package first_meeting;

import java.util.Scanner;

public class yr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("반복 횟수를 입력하세요: ");
        int count = scanner.nextInt(); //반복 횟수
        int cnt = 0;
        double PI = 0;

        while(count > cnt){
            cnt ++;

            if(cnt % 2 == 0){ //시도횟수가 짝수일 때는 값을 빼준다.
                PI = PI - ((double)4/(2*cnt-1));
            }
            else{ //시도횟수가 홀수라면 값을 더해준다.
                PI = PI + ((double)4/(2*cnt-1));
            }

        }

        System.out.println("PI = " + PI);
    }
}
