package Third_meeting;

import java.util.Scanner;

class Person2 {
    static void print() {
        System.out.println("Person");
    }
}

class Student2 extends Person2 {
    static void print() {
        System.out.println("Student");
    }
}

class Researcher extends Person2 {
    static void print() {
        System.out.println("Researcher");
    }
}

class Professor extends Researcher {
    static void print() {
        System.out.println("Professor");
    }
}

public class hy3 {
    static void print(Person2 p) {
        if (p instanceof Person2)
            Person2.print();
        if (p instanceof Student2)
            Student2.print();
        if (p instanceof Researcher)
            Researcher.print();
        if (p instanceof Professor)
            Professor.print();
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("2018314009 김희범");
        System.out.println("1.Person, 2.Student, 3. Researcher, 4. Professor");

        int select = scanner.nextInt();

        switch (select){
            case 1:
                Person2 p = new Person2();
                print(p);
                break;
            case 2:
                Student2 s = new Student2();
                print(s);
                break;
            case 3:
                Researcher r = new Researcher();
                print(r);
                break;
            case 4:
                Professor pr = new Professor();
                print(pr);
                break;
            default:
                System.out.println("1~4의 숫자를 입력해주세요");
                System.exit(0);
        }
    }
}
