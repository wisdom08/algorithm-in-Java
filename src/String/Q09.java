package String;


import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Q09 T = new Q09();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution2(str));
    }

    private int solution(String str) {

        int answer = 0;

        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) {
                answer = answer * 10 + (c - 48);
            }
        }

        return answer;
    }

    private int solution2(String str) {
        String answer = "";

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                answer += c;
            }
        }


        return Integer.parseInt(answer);
    }
}


