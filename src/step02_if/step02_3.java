package step02_if;

import java.util.Scanner;

public class step02_3 {
    public static void main(String[] args) {
        //2753번. 윤년
        //윤년을 판별하는 문제
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        if(year>=1 && year<=4000) {
            if (year%4==0 && year%100!=0||year % 400== 0)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
