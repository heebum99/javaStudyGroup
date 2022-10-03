package second_meeting;

//Info��� Ŭ������ �����ϰ� Info Ŭ������ �ʵ�� �й�, �̸�, �а�, ��̰� �ִ�.
//���� ������ Ű����� �Է¹޵� �����ڸ� ���� �������� �ʱ�ȭ�Ѵ�.
//��̰� ���� ��� 1, �ִ� ��� 2�� �Է¹ް� 1�� �Է��� ��� �й�,�̸�,�а��� �Է��� �޴´�.
//���� ��̸� �Է����� �ʾ����� �����ڿ��� this() ���۷����� �̿��� ��̿� �ڵ����� "�ڵ�"�̶�� ������ �ʱ�ȭ �� �� �ֵ��� �Ѵ�.
//�޼��带 ���ؼ� ��������(�й�,�̸�,�а�,���)�� ��µǵ��� �Ѵ�.

import java.util.Scanner;

class Info{
    //�ʵ�
    private int student_id;
    private String name;
    private String department;
    private String hobby;
    
    //������
    //�й�,�̸�,�а�,��� 4���� �Ű������� �޴� ������
    public Info(int student_id, String name, String department, String hobby){
        this.student_id = student_id;
        this.name = name;
        this.department = department;
        this.hobby = hobby;
    }

    //�й�,�̸�,�а� 3���� �Ű������� �޴� ������
    public Info(int student_id,String name, String department){
        this(student_id,name,department,"�ڵ�");
    }

    //�޼���
    public void print_Info(){ //�������� �й�,�̸�,�а�,��̸� ����ϴ� �޼���
        System.out.println("�й�:"+student_id);
        System.out.println("�̸�:"+name);
        System.out.println("�а�:"+department);
        System.out.print("���:"+hobby);
    }
}

public class hb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("�������� �Է�:");
        System.out.print("��̰� �ִ� ��� 1�� ���� ��� 2�� �Է����ּ��� >> ");
        int select = scanner.nextInt();

        int student_id;
        String name;
        String department;
        String hobby;

        if(select == 1){
            System.out.println("�й�, �̸�, �а� ������� ���������� �Է����ּ���.");

            student_id = scanner.nextInt();
            name = scanner.next();
            department = scanner.next();

            Info info = new Info(student_id,name,department);
            info.print_Info();
        }

        else{
            System.out.println("�й�, �̸�, �а�, ��� ������� ���������� �Է����ּ���.");

            student_id = scanner.nextInt();
            name = scanner.next();
            department = scanner.next();
            hobby = scanner.next();

            Info info = new Info(student_id,name,department,hobby);
            info.print_Info();
        }
    }
}
