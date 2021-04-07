package String;


import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Q08 T = new Q08();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(T.solution(str));
    }

    private String solution(String str) {

        String answer = "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]", " ");

        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp)) {
            answer = "YES";
        }

        return answer;
    }
}


