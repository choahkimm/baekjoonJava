package step03_for;

import java.util.Scanner;

public class step03_03 {
    public static void main(String[] args) {
        // 8393번. 합
        // n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n>=1 && n<=10000) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
