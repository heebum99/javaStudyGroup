package Third_meeting;

import java.util.ArrayList;

class Pizza2{
    //�ʵ�
    String toppings;
    int price;
    static int count = 0;

    //������
    public Pizza2(String toppings, int price){
        this.toppings = toppings;
        this.price = price;
    }
}

public class hyo3 {
    public static void main(String[] args) {
       ArrayList<Pizza2> pizza = new ArrayList<Pizza2>(); //���� ��ü �迭 ����
        pizza.add(0,new Pizza2("Super Supreme",10000));
        pizza.add(1,new Pizza2("Cheese",12000));
        pizza.add(2,new Pizza2("Pepperoni",14000));
        pizza.add(3,new Pizza2("Pepperoni Delux",16000));
        pizza.add(4,new Pizza2("Cheese Delux",16000));

        System.out.println(pizza.get(0).toppings+"�� ������ "+pizza.get(0).price+"�� �Դϴ�");
        System.out.println(pizza.get(1).toppings+"�� ������ "+pizza.get(1).price+"�� �Դϴ�");
        System.out.println(pizza.get(2).toppings+"�� ������ "+pizza.get(2).price+"�� �Դϴ�");
        System.out.println(pizza.get(3).toppings+"�� ������ "+pizza.get(3).price+"�� �Դϴ�");
        System.out.println(pizza.get(4).toppings+"�� ������ "+pizza.get(4).price+"�� �Դϴ�");

    }
}
