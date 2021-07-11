package step04_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class step04_03 {
    public static void main(String[] args) throws IOException {
        // 1110번. 더하기 사이클
        // N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 주어진 수
        int copy = N; // 새로운 수
        int count = 0; // 사이클 수

        while(true){
            int a = N /10 ;
            int b = N % 10 ;
            copy = a*10 + (a+b)%10 ;
            count++;
            if(N == copy) {
                break;
            }
        }
        System.out.println(count);
    }
}
