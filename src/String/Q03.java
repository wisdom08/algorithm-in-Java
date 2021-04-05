package String;


import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Q03 T = new Q03();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(T.solution(str, c));
    }

    private int solution(String str, char c) {
        int num = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        System.out.println("str = " + str);
        System.out.println("c = " + c);

        char[] chars = str.toCharArray();

        for (char aChar : chars) {
            if (aChar == c) {
                num++;
            }
        }

        /*for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                num++;
            }
        }*/

        return num;
    }
}

