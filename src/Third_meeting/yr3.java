package Third_meeting;

class Pizza {
    //�ʵ�
    int radius;
    String toppings;

    //������
    Pizza() {
        this(10, "ġ��");
    }

    Pizza(int radius) {
        this(radius, "ġ��");
    }

    Pizza(int radius, String toppings) {
        this.radius = radius;
        this.toppings = toppings;
    }

    //�޼ҵ�
    public Pizza whoLargest(Pizza obj1, Pizza obj2) { //�ΰ��� ��ü�� �� ū ���ڸ� ��ȯ���ִ� �Լ�
        return obj1.radius > obj2.radius ? obj1 : obj2;
    }
}

public class yr3 {
    public static void main(String[] args) {
        Pizza obj1 = new Pizza();
        Pizza obj2 = new Pizza(14);
        Pizza obj3 = new Pizza(18, "��������");

        Pizza largest = obj1.whoLargest(obj1, obj2);
        System.out.println(largest.radius + "��ġ ũ���� " + largest.toppings + "���ڰ� �� ũ��");

        largest = obj1.whoLargest(obj2, obj3);
        System.out.println(largest.radius + "��ġ ũ���� " + largest.toppings + "���ڰ� �� ũ��");
    }
}
