package step03_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step03_02_b {
    public static void main(String[] args) throws IOException {
        //10950번. A+B-3
        // 더 나은 성능을 위한 방법 (출처 : https://st-lab.tistory.com/28)
        // BufferedReader은 문자열로 받아들이게 되는데 우리가 원하는 건 한 줄에 정수 2개이니
        // 공백을 기준으로 문자열을 분리해주어야 한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  // 몇 번 돌릴거냐

        StringTokenizer st; // split() 메소드보다 성능이 더 좋다!
        StringBuilder sb = new StringBuilder();
        // 배열을 따로 생성하여 저장했다가 다시 출력하는 방식보다는
        // StringBuilder 에 계산한 식을 넣어준 뒤 나중에 한 번에 출력해주는 방식

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " "); // 공백을 기준으로 나눌 것
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }

        System.out.println(sb);
    }
}