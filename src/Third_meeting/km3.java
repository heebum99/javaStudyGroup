package Third_meeting;

import java.util.Scanner;

//Member Ŭ������ �ʵ忡 �й��� �̸�, id ������ ������
//Mentor�� Mentee Ŭ������ Member Ŭ������ ��� ������ ���� ȸ��� �а� ������ ������
//ID�� �ڵ������� ��ȣ�� �Ű�����

class Member {
    //�ʵ�
    protected int student_id; //�й�
    protected String name; //�̸�
    protected int id = 1;


    //������
    Member(int student_id, String name, int id) {
        this.student_id = student_id;
        this.name = name;
        this.id = id;
    }

    //�޼���
    void print_MemberList() { //��ü ��� ����� ���� �޼���
        //�޼��� �������̵��� ���ؼ� �������ε��� �Ͼ�� ����Ŭ������ �޼��尡 ȣ���.
    }
}

class Mentor extends Member {
    //�ʵ�
    private String company;


    //������
    Mentor(int student_id, String name, String company, int id) {
        super(student_id, name, id);
        this.company = company;
    }

    //�޼���
    void print_MemberList() { //���� ��� ����� ���� �޼���
        System.out.println(id + "\t" + student_id + "\t" + name + "\t" + company);
    }
}

class Mentee extends Member {
    //�ʵ�
    private String depart;

    //������
    Mentee(int student_id, String name, String depart, int id) {
        super(student_id, name, id);
        this.depart = depart;
    }

    //�޼���
    void print_MemberList() {//��Ƽ ��� ����� ���� �޼���
        System.out.println(id + "\t" + student_id + "\t" + name + "\t" + depart);
    }
}

class MemberManager {
    Scanner scanner = new Scanner(System.in);

    //�ʵ�
    private int index = 0;
    Member[] members = new Member[100];

    //�޼ҵ�
    public void addMentor() { //���並 �߰��ϴ� �޼ҵ�
        System.out.print("�й� : ");
        int student_id = scanner.nextInt();
        System.out.print("�̸� : ");
        String name = scanner.next();
        System.out.print("ȸ�� : ");
        String company = scanner.next();
        int id = index + 1;

        if (index < 100) {
            members[index++] = new Mentor(student_id, name, company, id); //�� ĳ����
            System.out.println("�߰� ����!");
        } else {
            System.out.println("�߰� ����..");
        }
    }

    public void addMentee() { //��Ƽ�� �߰��ϴ� �޼ҵ�
        System.out.print("�й� : ");
        int student_id = scanner.nextInt();
        System.out.print("�̸� : ");
        String name = scanner.next();
        System.out.print("���� : ");
        String depart = scanner.next();
        int id = index + 1;
        if (index < 100) {
            members[index++] = new Mentee(student_id, name, depart, id); //��ĳ����
            System.out.println("�߰� ����!");
        } else {
            System.out.println("�߰� ����..");
        }
    }

    public void print_MentorList(){ //���� ��� ���
        for(int i=0; i<index; i++){
            if(members[i] instanceof Mentor){
                members[i].print_MemberList();
            }
        }
    }

    public void print_MenteeList(){ //��Ƽ ��� ���
        for(int i=0; i<index; i++){
            if(members[i] instanceof Mentee){
                members[i].print_MemberList();
            }
        }
    }

    public void print_MemberList(){ //��� ��ü ��� ���
        for(int i=0; i<index; i++){
            if(members[i] instanceof Mentee){
                members[i].print_MemberList();
            }
            else{
                members[i].print_MemberList();
            }
        }
    }
}


public class km3 {
    static void print_menu() {
        System.out.println("< �� �� >");
        System.out.println("1. ��Ƽ �߰�");
        System.out.println("2. ���� �߰�");
        System.out.println("3. ��Ƽ ��� ���");
        System.out.println("4. ���� ��� ���");
        System.out.println("5. ��ü ��� ���");
        System.out.println("9. ����");
        System.out.print("Your choice >> ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberManager memberManager = new MemberManager();

        int choice, student_id, i = 0, id = 1;
        String name, depart, company;

        while (true) {
            print_menu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1: //��Ƽ �߰�
                    memberManager.addMentee();
                    break;
                case 2: //���� �߰�
                    memberManager.addMentor();
                    break;
                case 3: //��Ƽ ��� ���
                    memberManager.print_MenteeList();
                    break;
                case 4: //���� ��� ���
                    memberManager.print_MentorList();
                    break;
                case 5: //��ü ��� ���
                   memberManager.print_MemberList();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("�ٽ� �Է����ּ���");
            }
        }
    }
}
