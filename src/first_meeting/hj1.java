package first_meeting;

import java.util.Scanner;

//���������� ������ ���� ���� ����
//����s ����r ���ڱ�p
public class hj1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m, w; //m:ö�� w:����

        System.out.print("ö�� : ");
        m = scanner.next();

        System.out.print("���� : ");
        w = scanner.next();

        if(m.equals(w)){ //���� ���� ���� ���� ��
            System.out.println("���º� �Դϴ�.");
        }
        else{ //���� �ٸ� ���� ���� ��
            if(m.equals("s")){ //ö���� ������ ��
                if(w.equals("r")){ //���� �������
                    System.out.println("����, ��!");
                }
                else { //���� ���ڱ���
                    System.out.println("ö��, ��!");
                }
            } else if (m.equals("r")) { //ö���� ������ ��
                if (w.equals("s")) { //���� �������
                    System.out.println("ö��, ��!");
                } else { //���� ���ڱ���
                    System.out.println("����, ��!");
                }
            } else if (m.equals("p")) { //ö���� ���ڱ��϶�
                if(w.equals("r")) { //���� �������
                    System.out.println("ö��, ��!");
                }
                else{ //���� �������
                    System.out.println("����, ��!");
                }
            }
        }

    }
}
