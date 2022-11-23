package Sixth_meeting;

import javax.swing.*;

public class hyo6 extends JFrame {
    public hyo6() {
        String str;
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("첫번째 테스트 프레임 실습");

        //패널 생성, 2개의 Label과 32개 칸을 갖는 2개의 TextFiled를 생성
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JTextField t_input = new JTextField(32);
        JTextField t_output = new JTextField(32);

        //첫번째 TextFiled에는 "Tech University of Korea"이라는 문자열을 입력
        str = "Tech University of Korea";
        t_input.setText(str);
        panel.add(t_input);

        //입력된 문자열의 길이를 Label1로 패널에 표시함
        label1.setText("입력된 문자열의 길이는 " + str.length() + "입니다.");
        panel.add(label1);

        //"입력된 문자열의 역순 출력값은 다음과 같습니다"를 Label2로 표시
        label2.setText("입력된 문자열의 역순 출력값은 다음과 같습니다.");
        panel.add(label2);

        //입력된 문자열 "Tech University of Korea"의 길이를 구해
        //그 크기를 갖는 "문자배열" reverse_array를 생성
        //reverse_array에 입력된 문자열을 거꾸로 저장한 후 TextFiled에 출력함
        //문자배열을 문자열로 표시하기 위해서는 변환이 필요함
        //String.valueOf(reverse_array)을 통해 문자열로 변환
        char[] reverse_array = new char[str.length()]; //str 문자열과 같은 크기의 배열을 하나 생성
        for (int i = 0; i < str.length(); i++) {
            reverse_array[i] = str.charAt(str.length() - i - 1);
        }
        t_output.setText(String.valueOf(reverse_array));
        panel.add(t_output);

        add(panel); //패널을 프레임에 추가
        setVisible(true);
    }

    public static void main(String[] args) {
        hyo6 f = new hyo6();

    }
}
