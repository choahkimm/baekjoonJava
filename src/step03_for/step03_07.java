package step03_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step03_07 {
    public static void main(String[] args) throws IOException {
        // 11021번. A+B-7
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        for(int i=1; i<cnt+1 ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            sb.append("Case #").append(i).append(": ").append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append('\n');
        }
        System.out.println(sb);
        br.close();

    }
}
