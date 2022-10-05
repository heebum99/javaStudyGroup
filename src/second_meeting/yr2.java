package second_meeting;

class Box {
    //필드
    private double width;
    private double length;
    private double height; //가로,세로, 높이
    private double volume; //부피
    private double area; //겉넓이

    //생성자
    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
        System.out.println("상자의 가로, 세로, 높이는 "+width+", "+length+", "+height+"입니다.");
    }

    //메서드
    public void getArea() { //겉넓이 구하기
        area = (width + length + height) * 2;
        System.out.println("상자의 겉넓이는 " + area+"입니다.");
    }

    public void getVolume() { //부피 구하기
        volume = width * length * height;
        System.out.println("상자의 부피는 "+volume+"입니다.");
    }

}

public class yr2 {
    public static void main(String[] args) {
        Box box = new Box(20,20,30);
        box.getVolume();
        box.getArea();
    }
}
