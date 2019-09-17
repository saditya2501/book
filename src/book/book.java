import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class book{

    public static void main(String[] args) {

        String THE_BOOK_NAME;
        String THE_AUTHOR_NAME;
        String ISBN;

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        if(n!=0)
        {
            while(n!=0)
            {   if(n==m)
                sc.nextLine();
                THE_BOOK_NAME=sc.nextLine();
                THE_AUTHOR_NAME= sc.nextLine();
                ISBN=sc.nextLine();

                System.out.println("-----------------------------");
                System.out.println("Book Name:\t"+THE_BOOK_NAME);
                System.out.println("Author Name:\t"+THE_AUTHOR_NAME);
                System.out.println("ISBN:\t"+ISBN);
                System.out.println("-----------------------------");
                n--;       }
        }
        else
            System.out.println("N/A");
    }
}