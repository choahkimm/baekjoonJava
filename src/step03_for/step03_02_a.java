package step03_for;

import java.util.Scanner;

public class step03_02_a {
    public static void main(String[] args) {
        //10950번. A+B-3

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }

        sc.close();
    }
}
