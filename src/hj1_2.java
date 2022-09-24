import java.util.Scanner;

public class hj1_2 {

    //가위 바위 보 게임을 메서드를 통해 작성
    //이하 규칙은 hj1.java와 동일

    static String input(String player) {
        String pick; //주먹 가위 보 중 선택한 것
        Scanner scanner = new Scanner(System.in);

        System.out.print(player + " : ");
        pick = scanner.next();

        return pick;
    }

    static void whosWin(String c, String y) {
        if (c.equals(y)) { //서로 낸 것이 동일하면 무승부
            System.out.println("무승부 입니다.");
        } else { //서로 다른 것을 냈을 때
            if (c.equals("s")) { //철수가 가위일 때
                if (y.equals("r")) { //영희가 바위라면
                    System.out.println("영희, 승!");
                } else { //영희가 보자기라면
                    System.out.println("철수, 승!");
                }
            } else if (c.equals("r")) { //철수가 바위일 때
                if (y.equals("s")) { //영희가 가위라면
                    System.out.println("철수, 승!");
                } else { //영희가 보자기라면
                    System.out.println("영희, 승!");
                }
            } else if (c.equals("p")) { //철수가 보자기일때
                if (y.equals("r")) { //영희가 바위라면
                    System.out.println("철수, 승!");
                } else { //영희가 가위라면
                    System.out.println("영희, 승!");
                }
            }
        }
    }

    public static void main (String[]args){
        String c = input("철수");
        String y = input("영희");
        whosWin(c, y);
    }
}

