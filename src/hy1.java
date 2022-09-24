import java.util.Scanner;

//switch문으로 학점 매기기
//0~100 사이가 아닌 경우 에러 메시지출력 후 종료
//점수별로 A+, A0 ....C0, F로 학점을 수정
//+와 0는 gAdd라는 char 변수로 저장해 grade와 연결해 출력하기.

public class hy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char grade; //학점
        char gAdd; //0 or +
        System.out.print("점수를 입력하세요(0~100): ");

        int score = scanner.nextInt(); //점수 입력

        if(score<0 || score > 100){ //점수가 0보다 작거나 100보다 큰 수가 입력되면 에러 출력 후 종료
            System.out.println("0~100 사이의 점수를 입력해주세요!! 종료합니다.");
            System.exit(1);
        }

        //A+ => 90~100, A0 => 89~80, B+ => 79~70 B0 => ~60, C+ => ~50, C0 => ~40 F=> 39~0
        if((score>=90 && score <=100) || (score>=70 && score <=79) || (score>=50 && score <=59)){
            gAdd = '+';
        }
        else if((score>=80 && score <=89) || (score>=60 && score <=69) || (score>=40 && score <=49)){
            gAdd = '0';
        }
        else{
            gAdd=' ';
        }

        switch (score/10){
            case 10: //score == 100
            case 9: //score => 99 ~ 90
            case 8: //score => 89 ~ 80
                grade = 'A';
                break;
            case 7:
            case 6:
                grade = 'B';
                break;
            case 5:
            case 4:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }

        System.out.println("학점은 "+grade+gAdd+"입니다.");
        scanner.close();

    }
}
