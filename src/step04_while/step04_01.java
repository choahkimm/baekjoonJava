package step04_while;

import java.util.Scanner;

public class step04_01 {
    public static void main(String[] args) {
        // 10952번. A+B-5
        Scanner sc = new Scanner(System.in);

        while (true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A==0 && B==0) {
                sc.close();
                break;
            }
            System.out.println(A+B);
        }
    }
}
