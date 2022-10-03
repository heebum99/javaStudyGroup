package second_meeting;

//Info라는 클래스를 생성하고 Info 클래스의 필드는 학번, 이름, 학과, 취미가 있다.
//개인 정보를 키보드로 입력받되 생성자를 통해 변수들을 초기화한다.
//취미가 없는 경우 1, 있는 경우 2를 입력받고 1을 입력한 경우 학번,이름,학과만 입력을 받는다.
//만약 취미를 입력하지 않았을때 생성자에서 this() 레퍼런스를 이용해 취미에 자동으로 "코딩"이라는 값으로 초기화 될 수 있도록 한다.
//메서드를 통해서 개인정보(학번,이름,학과,취미)가 출력되도록 한다.

import java.util.Scanner;

class Info{
    //필드
    private int student_id;
    private String name;
    private String department;
    private String hobby;
    
    //생성자
    //학번,이름,학과,취미 4개를 매개변수로 받는 생성자
    public Info(int student_id, String name, String department, String hobby){
        this.student_id = student_id;
        this.name = name;
        this.department = department;
        this.hobby = hobby;
    }

    //학번,이름,학과 3개만 매개변수로 받는 생성자
    public Info(int student_id,String name, String department){
        this(student_id,name,department,"코딩");
    }

    //메서드
    public void print_Info(){ //개인정보 학번,이름,학과,취미를 출력하는 메서드
        System.out.println("학번:"+student_id);
        System.out.println("이름:"+name);
        System.out.println("학과:"+department);
        System.out.print("취미:"+hobby);
    }
}

public class hb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("개인정보 입력:");
        System.out.print("취미가 있는 경우 1을 없는 경우 2를 입력해주세요 >> ");
        int select = scanner.nextInt();

        int student_id;
        String name;
        String department;
        String hobby;

        if(select == 1){
            System.out.println("학번, 이름, 학과 순서대로 개인정보를 입력해주세요.");

            student_id = scanner.nextInt();
            name = scanner.next();
            department = scanner.next();

            Info info = new Info(student_id,name,department);
            info.print_Info();
        }

        else{
            System.out.println("학번, 이름, 학과, 취미 순서대로 개인정보를 입력해주세요.");

            student_id = scanner.nextInt();
            name = scanner.next();
            department = scanner.next();
            hobby = scanner.next();

            Info info = new Info(student_id,name,department,hobby);
            info.print_Info();
        }
    }
}
