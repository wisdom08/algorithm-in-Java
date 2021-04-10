package Array;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        Q03 T = new Q03();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        for (char c : T.solution(n, A, B).toCharArray()) {
            System.out.println(c);
        }
    }

    public String solution(int n, int[] a, int[] b) {

        String answer = "";

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                answer += "D";
            } else if (a[i] == 1 && b[i] == 3) {
                answer += "A";
            } else if (a[i] == 2 && b[i] == 1) {
                answer += "A";
            } else if (a[i] == 3 && b[i] == 2) {
                answer += "A";
            } else {
                answer += "B";
            }

        }

        return answer;
    }
}
