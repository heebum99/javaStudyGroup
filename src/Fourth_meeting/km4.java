package Fourth_meeting;

import java.util.Scanner;

abstract class Member { //슈퍼클래스 => 추상 클래스로 구현
    //필드
    protected int id; //번호
    protected int student_id; //학번
    protected String name; //이름

    //생성자
    Member(int id, int student_id, String name) {
        this.id = id;
        this.student_id = student_id;
        this.name = name;
    }

    //추상 메서드
    abstract void print_member();
}

class Mentee extends Member {
    //필드
    protected String major; //전공

    //생성자
    Mentee(int id, int student_id, String name, String major) {
        super(id, student_id, name);
        this.major = major;
    }

    @Override
    void print_member() {
        System.out.println(id + "\t" + student_id + "\t" + name + "\t" + major);
    }
}

class Mentor extends Member {
    //필드
    protected String organization; //회사

    //생성자
    Mentor(int id, int student_id, String name, String organization) {
        super(id, student_id, name);
        this.organization = organization;
    }

    @Override
    void print_member() {
        System.out.println(id + "\t" + student_id + "\t" + name + "\t" + organization);
    }
}

class MemberManager { //멘토, 멘티 관리
    Scanner scanner = new Scanner(System.in);

    //필드
    Member members[] = new Member[1000]; //객체 배열 생성
    private int index = 0;

    //메소드
    void add_Mentor() {
        System.out.print("학번 : ");
        int student_id = scanner.nextInt();
        System.out.print("이름 : ");
        String name = scanner.next();
        System.out.print("회사 : ");
        String organization = scanner.next();
        int id = index + 1;
        if (index > 1000) {
            System.out.println("추가 실패..");
        } else {
            members[index++] = new Mentor(id, student_id, name, organization); //업 캐스팅
            System.out.println("추가 성공!");
        }
    }

    void add_Mentee() {
        System.out.print("학번 : ");
        int student_id = scanner.nextInt();
        System.out.print("이름 : ");
        String name = scanner.next();
        System.out.print("전공 : ");
        String major = scanner.next();
        int id = index + 1;
        if (index > 1000) {
            System.out.println("추가 실패..");
        } else {
            members[index++] = new Mentee(id, student_id, name, major);
            System.out.println("추가 성공!");
        }
    }

    void print_MentorList() {
        for (int i = 0; i < members.length; i++) {
            if (members[i] instanceof Mentor) {
                members[i].print_member(); //동적바인딩 발생
            }
        }
    }

    void print_MenteeList() {
        for (int i = 0; i < members.length; i++) {
            if (members[i] instanceof Mentee) {
                members[i].print_member(); //동적바인딩 발생
            }
        }
    }

    void print_All() {
        for (int i = 0; i < members.length; i++) {
            if (members[i] instanceof Member) {
                members[i].print_member();
            }
        }
    }
}


public class km4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberManager memberManager = new MemberManager();

        while (true) {
            System.out.println("< 메 뉴 >");
            System.out.println("1. 멘티 추가");
            System.out.println("2. 멘토 추가");
            System.out.println("3. 멘티 목록 출력");
            System.out.println("4. 멘토 목록 출력");
            System.out.println("5. 전체 목록 출력");
            System.out.println("9. 종료");
            System.out.print("Your choice >> ");
            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    memberManager.add_Mentee();
                    break;
                case 2:
                    memberManager.add_Mentor();
                    break;
                case 3:
                    memberManager.print_MenteeList();
                    break;
                case 4:
                    memberManager.print_MentorList();
                    break;
                case 5:
                    memberManager.print_All();
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        }
    }
}
