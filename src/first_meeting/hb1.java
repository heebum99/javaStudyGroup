package first_meeting;

import java.util.Scanner;

//��� 5�� �Է¹޾� �迭�� ����, ���� ū ���� ����϶�
//0~100������ �� 5�� �Է¹ް� �����ϵ� ������ 100�� �Ѵ� ��� ����.
//�Էµ� �� �� ���� ���� ���� �� ��° �Է��� ���� ���� ���� ������ ���.

public class hb1 {
    public static void main(String[] args) {
        System.out.println("2018314009 �����");
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[5]; // ũ�Ⱑ 5�� �迭 ����
        int min=100; // �ּڰ�
        int num=0; //�� ��° �� ����

        System.out.println("��� 5���� �Է��ϼ���.");

        for(int i=0; i<5; i++) {
            intArray[i] = scanner.nextInt(); // �Է¹��� ������ �迭�� ����

            if(intArray[i]<0 || intArray[i]>100) { //�����ų� 100�̻��̸� ����
                i--;
                continue;
            }

            if(intArray[i] < min) { // intArray[i]�� ���� ���� ū ������ ũ��
                min = intArray[i]; // intArray[i]�� max�� ����
                num = i+1;
            }
        }

        System.out.print("���� ���� ���� " + min + "�̰� "+ (num)+"��° �Է��� ���� ���� ���� �� �Դϴ�.");

        scanner.close();
    }
}
