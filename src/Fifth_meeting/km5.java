package Fifth_meeting;

import java.util.*;

class Student {
    Scanner scanner = new Scanner(System.in);
    HashMap<Integer, Object> map = new HashMap<>();
    //필드
    int student_id;
    String name;
    int grade;
    String major;

    //생성자
    Student() {

    }

    Student(int student_id, String name, int grade, String major) {
        this.student_id = student_id;
        this.name = name;
        this.grade = grade;
        this.major = major;
    }

    //메서드
    void add_Student() {
        System.out.print("학번 : ");
        student_id = scanner.nextInt();
        System.out.print("이름 : ");
        name = scanner.next();
        System.out.print("학년 : ");
        grade = scanner.nextInt();
        System.out.print("전공 : ");
        major = scanner.next();
        System.out.println("추가 성공");
        map.put(student_id, new Student(student_id, name, grade, major));
    }

    void search_Student() {
        System.out.print("찾으시는 학생의 학번 입력 >> ");
        int student_id = scanner.nextInt();
        if (map.containsKey(student_id)) {
            System.out.println(map.get(student_id).toString());
        } else {
            System.out.println("해당 학번을 가진 학생을 찾을 수 없습니다.");
        }
    }

    void delete_Student() {
        System.out.print("삭제할 학생의 학번 입력 >> ");
        int student_id = scanner.nextInt();
        if (map.containsKey(student_id)) {
            map.remove(student_id);
            System.out.println("삭제 완료!");
        } else {
            System.out.println("해당 학번을 가진 학생을 찾을 수 없습니다.");
        }
    }

    void print_Student() {
        for(int key : map.keySet()){
            System.out.println("======================");
            System.out.println(map.get(key).toString());
            System.out.println("======================");
        }
    }

    public String toString() {
        return "[ 학번 : " + student_id + " ]\n"
                + "[ 이름 : " + name + " ]\n"
                + "[ 학년 : " + grade + " ]\n"
                + "[ 전공 : " + major + " ]";
    }
}

public class km5 {
    static void print_menu() {
        System.out.println("-- 메뉴 --");
        System.out.println("1. 추가");
        System.out.println("2. 찾기");
        System.out.println("3. 삭제");
        System.out.println("4. 출력");
        System.out.println("5. 종료");
        System.out.print("선택 >> ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        while (true) {
            print_menu();
            int select = scanner.nextInt();

            switch (select) {
                case 1: //추가
                    student.add_Student();
                    break;
                case 2: //찾기
                    student.search_Student();
                    break;
                case 3: //삭제
                    student.delete_Student();
                    break;
                case 4: //출력
                    student.print_Student();
                    break;
                case 0: //종료
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
