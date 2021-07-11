package step03_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step03_04 {
    public static void main(String[] args) throws IOException {
        // 15552번. 빠른 A+B
        // 주의 ) 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다.
        // Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
        // BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());  // 몇 번 돌릴거냐

        StringTokenizer st;
        StringBuilder sb= new StringBuilder();

        for (int i=0; i<cnt; i++){
            st = new StringTokenizer(br.readLine()," ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}
