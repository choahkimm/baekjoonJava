package step04_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step04_01_2 {
    public static void main(String[] args) throws IOException {
        // 10952번. A+B-5
        //성능 향상을 위한 방법

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true) {
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A==0 && B==0) {
                break;
            }
            sb.append((A+B)).append('\n');
        }

        System.out.println(sb);
    }
}