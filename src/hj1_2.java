import java.util.Scanner;

public class hj1_2 {

    //���� ���� �� ������ �޼��带 ���� �ۼ�
    //���� ��Ģ�� hj1.java�� ����

    static String input(String player) {
        String pick; //�ָ� ���� �� �� ������ ��
        Scanner scanner = new Scanner(System.in);

        System.out.print(player + " : ");
        pick = scanner.next();

        return pick;
    }

    static void whosWin(String c, String y) {
        if (c.equals(y)) { //���� �� ���� �����ϸ� ���º�
            System.out.println("���º� �Դϴ�.");
        } else { //���� �ٸ� ���� ���� ��
            if (c.equals("s")) { //ö���� ������ ��
                if (y.equals("r")) { //���� �������
                    System.out.println("����, ��!");
                } else { //���� ���ڱ���
                    System.out.println("ö��, ��!");
                }
            } else if (c.equals("r")) { //ö���� ������ ��
                if (y.equals("s")) { //���� �������
                    System.out.println("ö��, ��!");
                } else { //���� ���ڱ���
                    System.out.println("����, ��!");
                }
            } else if (c.equals("p")) { //ö���� ���ڱ��϶�
                if (y.equals("r")) { //���� �������
                    System.out.println("ö��, ��!");
                } else { //���� �������
                    System.out.println("����, ��!");
                }
            }
        }
    }

    public static void main (String[]args){
        String c = input("ö��");
        String y = input("����");
        whosWin(c, y);
    }
}

