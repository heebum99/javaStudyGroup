package Fifth_meeting;

interface Comparable { //실제로는 제네릭을 사용해서 정의
    int compareTo(Object other); //-1, 0, 1 반환
}

class Rectangle implements Comparable {
    //필드
    int width;
    int height;

    //생성자
    Rectangle() {
        width = 0;
        height = 0;
    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println("Rectangle [width=" + width + ", height=" + height + "]");
    }

    //메서드

    public int compareTo(Object other) { //추상 메서드 구현
        Rectangle rectangle =(Rectangle)other;
        int area1 = width*height;
        int area2 = rectangle.height*rectangle.width;

        if(area1>area2){
            return -1;
        } else if (area1<area2) {
            return 1;
        }else{
            return 0;
        }
    }

}

public class yr5 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(100, 30);
        Rectangle rectangle2 = new Rectangle(200, 10);

        if (rectangle1.compareTo(rectangle2) == -1) { //rectangle1이 더 클때
            System.out.print("Rectangle [width=" + rectangle1.width + ", height=" + rectangle1.height + "]가 더 큽니다.");
        } else if (rectangle1.compareTo(rectangle2) == 1) { //rectangle1이 더 작을때
            System.out.print("Rectangle [width=" + rectangle2.width + ", height=" + rectangle2.height + "]가 더 큽니다.");
        } else { //서로 같을때
            System.out.print("두 Rectangle의 크기가 서로 같습니다.");
        }
    }
}
