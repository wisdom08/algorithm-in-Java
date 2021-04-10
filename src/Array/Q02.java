package Array;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        Q02 T = new Q02();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }

    public int solution(int n, int[] arr) {

        int answer = 1;
        int max = arr[0];

        for (int i : arr) {

            if (i > max) {
                max = i;
                answer++;
            }

        }

        return answer;
    }
}
