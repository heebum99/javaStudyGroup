package second_meeting;

import java.util.Scanner;

class Book{
    //鞘靛
    String title, author;

    //积己磊
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
            System.out.print("力格>>");
            String title = scanner.nextLine();
            System.out.print("历磊>>");
            String author = scanner.nextLine();
            book[i] =  new Book(title,author);
        }

        for(int i=0; i<book.length; i++){
            System.out.println("历磊: "+book[i].author+", 力格: "+book[i].title+"");
        }

        scanner.close();
    }
}
