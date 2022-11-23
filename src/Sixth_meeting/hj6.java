package Sixth_meeting;

import java.util.ArrayList;
import java.util.Scanner;

public class hj6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int max_score = 0;

        while (true) {
            System.out.print("점수를 입력하세요 : ");
            int score = scanner.nextInt();
            if (score < 0) { //음수가 입력되면 입력 종료
                break;
            }
            list.add(score);
        }
        char grade[] = new char[list.size()];
        for (int i = 0; i < list.size(); i++) { //최고 점수 구하기
            if (max_score < list.get(i)) {
                max_score = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) - max_score >= -10) {
                grade[i] = 'A';
            } else if (list.get(i) - max_score >= -20) {
                grade[i] = 'B';
            } else {
                grade[i] = 'C';
            }
        }

        System.out.println("전체 학생은 " + list.size() + "명이다.");
        System.out.print("학생들의 성적 : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "번 학생의 성적은 " + list.get(i) + "점이며 등급은 " + grade[i] + "이다.");
        }


    }
}
