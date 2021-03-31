package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Q01 T = new Q01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }

    }

    private ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }


        /*for (String x : str) {
            char[] chars = x.toCharArray();
            int lt = 0,  rt = x.length() - 1;
            while (lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp  = String.valueOf(chars);
            answer.add(tmp);
        }*/

        return answer;
    }
}

