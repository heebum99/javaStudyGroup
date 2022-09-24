import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class km1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int ary[] = new int[3];
//
//        System.out.print("정수 3개 입력>>");
//
//        for(int i=0; i<3; i++){
//            ary[i] = scanner.nextInt();
//        }
//
//        Arrays.sort(ary);
//        int mid_num = ary[ary.length/2];
//
//        System.out.println("중간 값은 "+mid_num);

        System.out.print("정수 3개 입력>>");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max=num1,mid=num2,min=num3;

        if(num1 > num2 && num1 > num3) {
            max = num1;

            if (num2 > num3) {
                mid = num2;
                min = num3;
            } else {
                mid = num3;
                min = num2;
            }
        } else if(num2 > num1 && num2 > num3) {
            max = num2;

            if (num1 > num3) {
                mid = num1;
                min = num3;
            } else {
                mid = num3;
                min = num1;
            }
        } else if(num3 > num2 && num3 > num1) {
            max = num3;

            if (num2 > num1) {
                mid = num2;
                min = num1;
            } else {
                mid = num1;
                min = num2;
            }
        }

        System.out.println("중간 값은 "+mid);


    }
}
