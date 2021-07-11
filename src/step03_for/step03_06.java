package step03_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class step03_06 {
    public static void main(String[] args) throws IOException {
        // 2742번. 기찍N

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        for(int i=cnt ; i >0; i--){
            System.out.println(i);
        }
        br.close();

    }
}
