package String;


import java.util.Calendar;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Q04 T = new Q04();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";

        char[] chars = str.toCharArray();

        for (char aChar : chars) {
            if (Character.isLowerCase(aChar)) {
                answer += Character.toUpperCase(aChar);
            } else {
                answer += Character.toLowerCase(aChar);
            }
        }

        /*for (char aChar : chars) {
            if (aChar >= 97 && aChar <= 122) {
                answer += (char) (aChar - 32);
            } else {
                answer += (char) (aChar + 32);
            }
        }*/


        return answer;
    }
}1

