package step03_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step03_08 {
    public static void main(String[] args) throws IOException {
        // 11022번. A+B - 8
        // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int a;
        int b;

        for(int i=1; i<cnt+1 ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b= Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i).append(": ").append(a).append(" + ").
                    append(b).append(" = ").append(a+b).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}
