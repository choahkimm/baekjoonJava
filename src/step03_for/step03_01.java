package step03_for;

import java.util.Scanner;

public class step03_01 {
    public static void main(String[] args) {
        //2739번. 구구단
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=0; i<10 ; i++){
            if(n>=1&& n<=9 && i>0){
                System.out.println(n + " * " + i + " = " + n*i);
            }
          }
        }
    }

