package Third_meeting;

//Person - Student - ForeignStudent Ŭ���� �ۼ�
//PersonŸ���� �迭�� Person,Student,ForeignStudent Ÿ���� ��ü�� 1���� ����
//foreach���� ����� �� ������ ������ ����ϴ� ���α׷� �ۼ�

class Person {
    //�ʵ�
    String name;
    int age;

    //������
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //�޼���
    public String show() {
        return ("���[�̸� : " + name + ", ���� : " + age + "]");
    }
}

class Student extends Person {
    //�ʵ�
    int student_id;

    //������
    public Student(String name, int age, int student_id) {
        super(name, age);
        this.student_id = student_id;
    }

    //�޼��� �������̵�
    public String show() {
        return ("�л�[�̸� : " + name + ", ���� : " + age + ", �й� : " + student_id + "]");
    }
}

class ForeignStudent extends Student {
    //�ʵ�
    String nation;

    //������
    public ForeignStudent(String name, int age, int student_id, String nation) {
        super(name, age, student_id);
        this.nation = nation;
    }

    //�޼��� �������̵�
    public String show() {
        return ("�ܱ��л�[�̸� : " + name + ", ���� : " + age + ", �й� : " + student_id + ", ���� : " + nation + "]");
    }
}


class hj3 {
    public static void main(String[] args) {
        Person [] p = new Person[3];
        p[0] = new Person("�浿��",22);
        p[1] = new Student("Ȳ����",23,100);
        p[2] = new ForeignStudent("Amy",30,200,"U.S.A");

        for (Person person: p) {
            System.out.println(person.show());
        }
    }
}
