package second_meeting;

class Television{
    //�ʵ�
    int channel; //ä�� ��ȣ
    int volume; //����
    boolean onOff; //��������

    //������
    public Television(int channel, int volume, boolean onOff){
        this.channel = channel;
        this.volume = volume;
        this.onOff = onOff;
    }

}

public class hyo2 {
    public static void main(String[] args) {
        Television tv = new Television(7,10,true);
        Television tv2 = new Television(9,12,true);
        System.out.println("���� �ڷ������� ä���� "+tv.channel+"�̰� ������ "+tv.volume+"�Դϴ�.");
        System.out.println("���� �ڷ������� ä���� "+tv2.channel+"�̰� ������ "+tv2.volume+"�Դϴ�.");
    }
}
