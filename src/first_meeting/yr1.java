package first_meeting;

import java.util.Scanner;

public class yr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("�ݺ� Ƚ���� �Է��ϼ���: ");
        int count = scanner.nextInt(); //�ݺ� Ƚ��
        int cnt = 0;
        double PI = 0;

        while(count > cnt){
            cnt ++;

            if(cnt % 2 == 0){ //�õ�Ƚ���� ¦���� ���� ���� ���ش�.
                PI = PI - ((double)4/(2*cnt-1));
            }
            else{ //�õ�Ƚ���� Ȧ����� ���� �����ش�.
                PI = PI + ((double)4/(2*cnt-1));
            }

        }

        System.out.println("PI = " + PI);
    }
}
