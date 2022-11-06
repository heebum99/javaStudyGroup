package Fifth_meeting;

import java.util.*;

public class hb5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> dic = new HashMap<String, String>();
        for (int i = 0; i < 3; i++) {
            String eng = scanner.next();
            if (dic.containsKey(eng) == true) {
                System.out.println("동일한 단어가 존재합니다. 다시입력해주세요");
                i--;
                continue;
            } else {
                String kor = scanner.next();
                dic.put(eng, kor);
            }
        }

        while (true) {
            System.out.print("찾고 싶은 단어는?");
            String eng = scanner.next();
            if (eng.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }
            String kor = dic.get(eng);
            if (kor == null) System.out.println(eng + "는 없는 단어 입니다.");
            else System.out.println(kor);
        }
        scanner.close();

    }


}
