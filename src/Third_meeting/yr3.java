package Third_meeting;

class Pizza {
    //필드
    int radius;
    String toppings;

    //생성자
    Pizza() {
        this(10, "치즈");
    }

    Pizza(int radius) {
        this(radius, "치즈");
    }

    Pizza(int radius, String toppings) {
        this.radius = radius;
        this.toppings = toppings;
    }

    //메소드
    public Pizza whoLargest(Pizza obj1, Pizza obj2) { //두개의 객체중 더 큰 피자를 반환해주는 함수
        return obj1.radius > obj2.radius ? obj1 : obj2;
    }
}

public class yr3 {
    public static void main(String[] args) {
        Pizza obj1 = new Pizza();
        Pizza obj2 = new Pizza(14);
        Pizza obj3 = new Pizza(18, "포테이토");

        Pizza largest = obj1.whoLargest(obj1, obj2);
        System.out.println(largest.radius + "인치 크기의 " + largest.toppings + "피자가 더 크다");

        largest = obj1.whoLargest(obj2, obj3);
        System.out.println(largest.radius + "인치 크기의 " + largest.toppings + "피자가 더 크다");
    }
}
