package second_meeting;

class Box {
    //�ʵ�
    private double width;
    private double length;
    private double height; //����,����, ����
    private double volume; //����
    private double area; //�ѳ���

    //������
    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
        System.out.println("������ ����, ����, ���̴� "+width+", "+length+", "+height+"�Դϴ�.");
    }

    //�޼���
    public void getArea() { //�ѳ��� ���ϱ�
        area = (width + length + height) * 2;
        System.out.println("������ �ѳ��̴� " + area+"�Դϴ�.");
    }

    public void getVolume() { //���� ���ϱ�
        volume = width * length * height;
        System.out.println("������ ���Ǵ� "+volume+"�Դϴ�.");
    }

}

public class yr2 {
    public static void main(String[] args) {
        Box box = new Box(20,20,30);
        box.getVolume();
        box.getArea();
    }
}
