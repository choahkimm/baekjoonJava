package step02_if;

import java.util.Scanner;

public class step02_5 {
    public static void main(String[] args) {
        //2884번. 알람 시계
        //45분 일찍 알람 설정하기
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
            if(h<=24){
                if(m>=0 && m<=60){
                    if(m<45){
                        h--;
                        m=(m+60)-45;

                        if(h<0) {
                            h = 23;
                        }
                        System.out.println(h + " " +m);
                    }
                    else
                        System.out.println(h + " " + (m-45));
                    }
                }
            }
    }

