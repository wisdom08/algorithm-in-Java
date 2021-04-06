package String;


import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Q06 T = new Q06();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));

            if (i == str.indexOf(str.charAt(i))) {
                answer += str.charAt(i);
            }

        }

        return answer;
    }
}


