package first_meeting;

import java.util.Scanner;

//가위바위보 게임을 통해 승자 결정
//가위s 바위r 보자기p
public class hj1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m, w; //m:철수 w:영희

        System.out.print("철수 : ");
        m = scanner.next();

        System.out.print("영희 : ");
        w = scanner.next();

        if(m.equals(w)){ //서로 같은 것을 냈을 때
            System.out.println("무승부 입니다.");
        }
        else{ //서로 다른 것을 냈을 때
            if(m.equals("s")){ //철수가 가위일 때
                if(w.equals("r")){ //영희가 바위라면
                    System.out.println("영희, 승!");
                }
                else { //영희가 보자기라면
                    System.out.println("철수, 승!");
                }
            } else if (m.equals("r")) { //철수가 바위일 때
                if (w.equals("s")) { //영희가 가위라면
                    System.out.println("철수, 승!");
                } else { //영희가 보자기라면
                    System.out.println("영희, 승!");
                }
            } else if (m.equals("p")) { //철수가 보자기일때
                if(w.equals("r")) { //영희가 바위라면
                    System.out.println("철수, 승!");
                }
                else{ //영희가 가위라면
                    System.out.println("영희, 승!");
                }
            }
        }

    }
}
