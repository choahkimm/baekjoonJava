package step03_for;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class step03_10 {
        public static void main(String[] args) throws IOException {
            // 2439번. 별 찍기 -2
            // 별찍기 + 오른쪽 정렬

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            br.close();

            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N-i; j++) { // 공백 처리
                    sb.append(' ');
                }
                for (int k = 1; k <= i; k++) {  // * 처리
                    sb.append('*');
                }
                sb.append('\n');
            }
            System.out.print(sb);
        }
    }

