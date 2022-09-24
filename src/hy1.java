import java.util.Scanner;

//switch������ ���� �ű��
//0~100 ���̰� �ƴ� ��� ���� �޽������ �� ����
//�������� A+, A0 ....C0, F�� ������ ����
//+�� 0�� gAdd��� char ������ ������ grade�� ������ ����ϱ�.

public class hy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char grade; //����
        char gAdd; //0 or +
        System.out.print("������ �Է��ϼ���(0~100): ");

        int score = scanner.nextInt(); //���� �Է�

        if(score<0 || score > 100){ //������ 0���� �۰ų� 100���� ū ���� �ԷµǸ� ���� ��� �� ����
            System.out.println("0~100 ������ ������ �Է����ּ���!! �����մϴ�.");
            System.exit(1);
        }

        //A+ => 90~100, A0 => 89~80, B+ => 79~70 B0 => ~60, C+ => ~50, C0 => ~40 F=> 39~0
        if((score>=90 && score <=100) || (score>=70 && score <=79) || (score>=50 && score <=59)){
            gAdd = '+';
        }
        else if((score>=80 && score <=89) || (score>=60 && score <=69) || (score>=40 && score <=49)){
            gAdd = '0';
        }
        else{
            gAdd=' ';
        }

        switch (score/10){
            case 10: //score == 100
            case 9: //score => 99 ~ 90
            case 8: //score => 89 ~ 80
                grade = 'A';
                break;
            case 7:
            case 6:
                grade = 'B';
                break;
            case 5:
            case 4:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }

        System.out.println("������ "+grade+gAdd+"�Դϴ�.");
        scanner.close();

    }
}
