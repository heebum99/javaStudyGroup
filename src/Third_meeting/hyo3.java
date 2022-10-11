package Third_meeting;

import java.util.ArrayList;

class Pizza2{
    //필드
    String toppings;
    int price;
    static int count = 0;

    //생성자
    public Pizza2(String toppings, int price){
        this.toppings = toppings;
        this.price = price;
    }
}

public class hyo3 {
    public static void main(String[] args) {
       ArrayList<Pizza2> pizza = new ArrayList<Pizza2>(); //동적 객체 배열 생성
        pizza.add(0,new Pizza2("Super Supreme",10000));
        pizza.add(1,new Pizza2("Cheese",12000));
        pizza.add(2,new Pizza2("Pepperoni",14000));
        pizza.add(3,new Pizza2("Pepperoni Delux",16000));
        pizza.add(4,new Pizza2("Cheese Delux",16000));

        System.out.println(pizza.get(0).toppings+"의 가격은 "+pizza.get(0).price+"원 입니다");
        System.out.println(pizza.get(1).toppings+"의 가격은 "+pizza.get(1).price+"원 입니다");
        System.out.println(pizza.get(2).toppings+"의 가격은 "+pizza.get(2).price+"원 입니다");
        System.out.println(pizza.get(3).toppings+"의 가격은 "+pizza.get(3).price+"원 입니다");
        System.out.println(pizza.get(4).toppings+"의 가격은 "+pizza.get(4).price+"원 입니다");

    }
}
