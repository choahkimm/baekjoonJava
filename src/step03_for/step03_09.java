package step03_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class step03_09 {
    public static void main(String[] args) throws IOException {
        // 2438번. 별 찍기-1
        // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

