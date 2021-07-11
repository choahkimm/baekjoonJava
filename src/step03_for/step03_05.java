package step03_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class step03_05 {
    public static void main(String[] args) throws IOException {
        // 2741번. N 찍기
        //자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());  // 몇 번 돌릴거냐

        for(int i = 1; i<=cnt ; i++) {
            System.out.println(i);
        }
        br.close();
    }
}
