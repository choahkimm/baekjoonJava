package step02_if;

import java.util.Scanner;

public class step02_4 {
    public static void main(String[] args) {
        // 14681번. 사분면 고르기
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        if(x>= -1000 && x<=1000 && x!=0) {
            if (y >= -1000 && y <= 1000 && y != 0) {
                if(x>0 && y>0)
                    System.out.println("1");
                else if(x<0 && y>0)
                    System.out.println("2");
                else if(x<0 && y<0)
                    System.out.println("3");
                else if(x>0 && y<0)
                    System.out.println("4");
            }
        }
    }
}
