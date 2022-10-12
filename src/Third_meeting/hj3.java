package Third_meeting;

//Person - Student - ForeignStudent 클래스 작성
//Person타입의 배열이 Person,Student,ForeignStudent 타입의 객체를 1개씩 포함
//foreach문을 사용해 각 원소의 정보를 출력하는 프로그램 작성

class Person {
    //필드
    String name;
    int age;

    //생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //메서드
    public String show() {
        return ("사람[이름 : " + name + ", 나이 : " + age + "]");
    }
}

class Student extends Person {
    //필드
    int student_id;

    //생성자
    public Student(String name, int age, int student_id) {
        super(name, age);
        this.student_id = student_id;
    }

    //메서드 오버라이딩
    public String show() {
        return ("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + student_id + "]");
    }
}

class ForeignStudent extends Student {
    //필드
    String nation;

    //생성자
    public ForeignStudent(String name, int age, int student_id, String nation) {
        super(name, age, student_id);
        this.nation = nation;
    }

    //메서드 오버라이딩
    public String show() {
        return ("외국학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + student_id + ", 국적 : " + nation + "]");
    }
}


class hj3 {
    public static void main(String[] args) {
        Person [] p = new Person[3];
        p[0] = new Person("길동이",22);
        p[1] = new Student("황진이",23,100);
        p[2] = new ForeignStudent("Amy",30,200,"U.S.A");

        for (Person person: p) {
            System.out.println(person.show());
        }
    }
}
