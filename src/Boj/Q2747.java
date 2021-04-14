package Boj;

import java.util.Scanner;

public class Q2747 {
    public static int N;
    public static boolean check[] = new boolean[100];
    public static int cache[] = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        System.out.println(fibo(N));
    }

    public static int fibo(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }

        if (check[n]) {
            return cache[n];
        }

        check[n] = true;
        return cache[n] = fibo(n - 1) + fibo(n - 2);
    }

}
