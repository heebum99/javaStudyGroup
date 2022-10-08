package Third_meeting;

import java.util.*;

class Shape { // 슈퍼 클래스
    // 필드
    public Shape next;

    // 생성자
    public Shape() {
        next = null;
    }

    // 메서드
    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Circle");
    }
}

public class hb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("2018314009 김희범");
        System.out.println("1.Line 2.Circle 3.Rect");

        int count = 0; // 반복 횟수를 위한 변수

        Shape start = null, last = null, obj;

        while (count < 4) { // 4회 반복
            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    obj = new Line();
                    break;
                case 2:
                    obj = new Circle();
                    break;
                case 3:
                    obj = new Rect();
                    break;
                default:
                    System.out.println("1~3의 수를 다시 입력해주세요.");
                    continue;
            }

            if (start == null) { // 처음 입력시
                start = obj;
                last = start;
            } else { // 2~4번 입력시
                last.next = obj;
                last = last.next;
            }

            count++;

        }

        Shape p = start;

        while (p != null) {
            p.draw();
            p = p.next;
        }
    }
}
