package first_meeting;

import java.util.Random;
import java.util.Scanner;

// ���α׷��� ������ �ִ� ������ ����ڰ� �˾Ƹ��ߴ� ����

public class hyoj1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int pro_num = random.nextInt(100)+1; //���α׷��� ������ �ִ� ������ 1~100���� ������ ����,
        System.out.print("���α׷��� ������ �ִ� ������ �˾� ���߼��� (1~100) : ");

        int cnt = 0; //�õ� Ƚ��

        while(true){
            cnt++;
            int input_num = scanner.nextInt();

            if(input_num > pro_num){
                System.out.println(input_num + " ���� �۽��ϴ�.");
            }
            else if(input_num < pro_num){
                System.out.println(input_num + " ���� Ů�ϴ�.");
            }
            else{
                System.out.println("�����մϴ�. �õ�Ƚ�� = " + cnt);
                break;
            }
        }

    }
}
