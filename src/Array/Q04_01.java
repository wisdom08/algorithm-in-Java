package Array;

import java.util.Scanner;

public class Q04_01 {

    public static void main(String[] args) {

        Q04_01 T = new Q04_01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.solution(n);
    }

    public void solution(int n) {

        int a= 1, b =1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}
