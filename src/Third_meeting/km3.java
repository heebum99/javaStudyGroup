package Third_meeting;

import java.util.Scanner;

//Member 클래스는 필드에 학번과 이름, id 변수를 가진다
//Mentor와 Mentee 클래스는 Member 클래스를 상속 받으며 각각 회사와 학과 변수를 가진다
//ID는 자동적으로 번호가 매겨진다

class Member {
    //필드
    protected int student_id; //학번
    protected String name; //이름
    protected int id = 1;


    //생성자
    Member(int student_id, String name, int id) {
        this.student_id = student_id;
        this.name = name;
        this.id = id;
    }

    //메서드
    void print_MemberList() { //전체 목록 출력을 위한 메서드
        //메서드 오버라이딩에 의해서 동적바인딩이 일어나고 서브클래스의 메서드가 호출됨.
    }
}

class Mentor extends Member {
    //필드
    private String company;


    //생성자
    Mentor(int student_id, String name, String company, int id) {
        super(student_id, name, id);
        this.company = company;
    }

    //메서드
    void print_MemberList() { //멘토 목록 출력을 위한 메서드
        System.out.println(id + "\t" + student_id + "\t" + name + "\t" + company);
    }
}

class Mentee extends Member {
    //필드
    private String depart;

    //생성자
    Mentee(int student_id, String name, String depart, int id) {
        super(student_id, name, id);
        this.depart = depart;
    }

    //메서드
    void print_MemberList() {//멘티 목록 출력을 위한 메서드
        System.out.println(id + "\t" + student_id + "\t" + name + "\t" + depart);
    }
}

class MemberManager {
    Scanner scanner = new Scanner(System.in);

    //필드
    private int index = 0;
    Member[] members = new Member[100];

    //메소드
    public void addMentor() { //멘토를 추가하는 메소드
        System.out.print("학번 : ");
        int student_id = scanner.nextInt();
        System.out.print("이름 : ");
        String name = scanner.next();
        System.out.print("회사 : ");
        String company = scanner.next();
        int id = index + 1;

        if (index < 100) {
            members[index++] = new Mentor(student_id, name, company, id); //업 캐스팅
            System.out.println("추가 성공!");
        } else {
            System.out.println("추가 실패..");
        }
    }

    public void addMentee() { //멘티를 추가하는 메소드
        System.out.print("학번 : ");
        int student_id = scanner.nextInt();
        System.out.print("이름 : ");
        String name = scanner.next();
        System.out.print("전공 : ");
        String depart = scanner.next();
        int id = index + 1;
        if (index < 100) {
            members[index++] = new Mentee(student_id, name, depart, id); //업캐스팅
            System.out.println("추가 성공!");
        } else {
            System.out.println("추가 실패..");
        }
    }

    public void print_MentorList(){ //멘토 목록 출력
        for(int i=0; i<index; i++){
            if(members[i] instanceof Mentor){
                members[i].print_MemberList();
            }
        }
    }

    public void print_MenteeList(){ //멘티 목록 출력
        for(int i=0; i<index; i++){
            if(members[i] instanceof Mentee){
                members[i].print_MemberList();
            }
        }
    }

    public void print_MemberList(){ //멤버 전체 목록 출력
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
        System.out.println("< 메 뉴 >");
        System.out.println("1. 멘티 추가");
        System.out.println("2. 멘토 추가");
        System.out.println("3. 멘티 목록 출력");
        System.out.println("4. 멘토 목록 출력");
        System.out.println("5. 전체 목록 출력");
        System.out.println("9. 종료");
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
                case 1: //멘티 추가
                    memberManager.addMentee();
                    break;
                case 2: //멘토 추가
                    memberManager.addMentor();
                    break;
                case 3: //멘티 목록 출력
                    memberManager.print_MenteeList();
                    break;
                case 4: //멘토 목록 출력
                    memberManager.print_MentorList();
                    break;
                case 5: //전체 목록 출력
                   memberManager.print_MemberList();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("다시 입력해주세요");
            }
        }
    }
}
