package String;


import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Q07 T = new Q07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }

    private String solution(String str) {

        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }


        return answer;
    }
}


