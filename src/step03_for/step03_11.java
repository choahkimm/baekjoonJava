package step03_for;

import java.io.IOException;
import java.util.Scanner;

public class step03_11 {
    public static void main(String[] args) throws IOException {
        // 10871번. X보다 작은 수
        // 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
        // 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        sc.close();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < N ; i++) {

            int value = sc.nextInt();
            if(value < X)
                sb.append(value+" ");
        }
        System.out.println(sb);
    }
}
