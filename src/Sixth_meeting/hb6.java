package Sixth_meeting;

import java.util.Scanner;
import java.util.Vector;

class Word {
    private String kor;
    private String eng;

    Word(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }

    String getKor() {
        return kor;
    }

    String getEng() {
        return eng;
    }
}

public class hb6 {
    static Scanner scanner = new Scanner(System.in);
    static Vector<Word> v = new Vector<>();
    static int[] question = new int[4];
    public static void Add_Word(){
        v.add(new Word("love", "사랑"));
        v.add(new Word("animal", "동물"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("apple", "사과"));
        v.add(new Word("picture", "사진"));
        v.add(new Word("painting", "그림"));
        v.add(new Word("baby", "아기"));
        v.add(new Word("eye", "눈"));
        v.add(new Word("society", "사회"));
        v.add(new Word("human", "인간"));
        v.add(new Word("emotion", "감정"));
        v.add(new Word("error", "오류"));
        v.add(new Word("example", "보기"));
        v.add(new Word("deal", "거래"));
    }
    public static void  Make_Question(){
        for (int i = 0; i < 4; i++) {
            int random_index = (int) (Math.random() * (v.size()));
            question[i] = random_index;
            for (int j = 0; j < i; j++) { //보기 중복 방지
                if (question[i] == question[j]) {
                    i--;
                    continue;
                }
            }
        }
    }
    public static void Game(){
        int answer_index = question[(int) (Math.random() * question.length)]; //0~3 인덱스 중 정답 인덱스 설정
        System.out.println(v.get(answer_index).getEng() + "?");
        for (int i = 0; i < question.length; i++) {
            if (i == question.length - 1) {
                System.out.print("(" + (i + 1) + ")" + v.get(question[i]).getKor() + " >> ");
            } else {
                System.out.println("(" + (i + 1) + ")" + v.get(question[i]).getKor());
            }
        }
        int select = scanner.nextInt();
        if (select == -1) {
            System.out.println("\"명품영어\"를 종료합니다.");
            System.exit(0);
        } else {
            if (v.get(question[select - 1]).getKor() == v.get(answer_index).getKor()) {
                System.out.println("Excellent!!");
            } else {
                System.out.println("No!!");
            }
        }
    }
    public static void main(String[] args) {
        Add_Word(); //단어 추가
        System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 " + v.size() + "개의 단어가 들어있습니다.");
        while (true) {
            Make_Question();
            Game();
        }
    }
}
