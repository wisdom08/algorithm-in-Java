package Array;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        Q05 T = new Q05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }

    public int solution(int n) {
        int answer = 0;

        // n+1까지 해야 n번 인덱스까지 생긴다.
        int[] ch = new int[n+1];

        for (int i = 2; i <=n; i++) {
            if (ch[i] == 0) {
                answer++;
                //i의 배수 돌면서 1로 체크하고 제거하기
                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }
}
