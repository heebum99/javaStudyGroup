package second_meeting;

import java.util.Scanner;

class Book{
    //�ʵ�
    String title, author;

    //������
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}
public class hy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book [] book = new Book[3];

        for(int i=0; i<book.length; i++){
            System.out.print("����>>");
            String title = scanner.nextLine();
            System.out.print("����>>");
            String author = scanner.nextLine();
            book[i] =  new Book(title,author);
        }

        for(int i=0; i<book.length; i++){
            System.out.println("����: "+book[i].author+", ����: "+book[i].title+"");
        }

        scanner.close();
    }
}
