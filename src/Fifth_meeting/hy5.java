package Fifth_meeting;

import java.util.Collections;
import java.util.Scanner;

class GStack<T> {
    int tos;
    Object[] stck;

    public GStack() {
        tos = 0;
        stck = new Object[5];
    }

    public boolean isFull() {
        if (tos == 5) {
            System.out.println("스택이 가득찼습니다.");
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (tos == 0) {
            System.out.println("스택이 비었습니다.");
            return true;
        } else {
            return false;
        }
    }

    public void push(T item) {
        stck[tos++] = item;
    }

    public T pop() {
        tos--;
        return (T) stck[tos];
    }
}

public class hy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GStack<String> stringStack = new GStack<String>();

        while (stringStack.isFull() == false) {
            String s = scanner.next();
            if (s.equals("exit")) {
                break;
            }
            stringStack.push(s);
        }

        int i = stringStack.tos;
        while (i > 0) {
            System.out.println(stringStack.pop());
            i--;
        }

    }

}
