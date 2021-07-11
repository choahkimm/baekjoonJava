package step01_IO;

import java.util.Scanner;

public class step01_5 {
    //1000번. 덧셈
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        sc.close();

        System.out.println(c);
    }
}
