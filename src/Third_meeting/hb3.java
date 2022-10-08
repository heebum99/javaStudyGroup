package Third_meeting;

import java.util.*;

class Shape { // ���� Ŭ����
    // �ʵ�
    public Shape next;

    // ������
    public Shape() {
        next = null;
    }

    // �޼���
    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw() { // �޼ҵ� �������̵�
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() { // �޼ҵ� �������̵�
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() { // �޼ҵ� �������̵�
        System.out.println("Circle");
    }
}

public class hb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("2018314009 �����");
        System.out.println("1.Line 2.Circle 3.Rect");

        int count = 0; // �ݺ� Ƚ���� ���� ����

        Shape start = null, last = null, obj;

        while (count < 4) { // 4ȸ �ݺ�
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
                    System.out.println("1~3�� ���� �ٽ� �Է����ּ���.");
                    continue;
            }

            if (start == null) { // ó�� �Է½�
                start = obj;
                last = start;
            } else { // 2~4�� �Է½�
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
