package Sixth_meeting;

import java.util.Scanner;

public class hy6 {
    static Scanner scanner = new Scanner(System.in);
    static int select;
    static int[] seats = new int[10];

    public hy6() {
        setting_seats();
        print_seat();
    }

    public static void main(String[] args) {
        new hy6();
    }

    public void setting_seats() {
        for (int i = 0; i < seats.length; i++) {
            seats[i] = 0;
        }
    }

    public void print_seat() {
        while (true) {
            System.out.print("좌석을 예약하시겠습니까?(1 또는 0) >> ");
            select = scanner.nextInt();
            if (select == 0) { //0을 입력받을 시 종료
                System.exit(0);
            }
            System.out.println("현재의 예약 상태는 다음과 같습니다.");
            System.out.println("-------------------------------");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("-------------------------------");
            for (int i = 0; i < seats.length; i++) {
                System.out.print(seats[i] + " ");
            }
            System.out.println();
            reserve_seat();
        }
    }

    public void reserve_seat() {
        System.out.print("몇번째 좌석을 예약하시겠습니까? ");
        select = scanner.nextInt();
        seats[select - 1] = 1;
        System.out.println("예약되었습니다.");
    }


}
