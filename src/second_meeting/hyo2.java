package second_meeting;

class Television{
    //필드
    int channel; //채널 번호
    int volume; //볼륨
    boolean onOff; //전원상태

    //생성자
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
        System.out.println("나의 텔레비전의 채널은 "+tv.channel+"이고 볼륨은 "+tv.volume+"입니다.");
        System.out.println("너의 텔레비전의 채널은 "+tv2.channel+"이고 볼륨은 "+tv2.volume+"입니다.");
    }
}
