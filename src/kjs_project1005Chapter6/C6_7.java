package kjs_project1005Chapter6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class C6_7 {

    static int countSpace(String s) {
        int count = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        while (stringTokenizer.hasMoreTokens()) {
            count++;
            stringTokenizer.nextToken();
        }
        return count;
    }

    static int countSpaceBySplit(String s) {
        return s.split(" ").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(">> ");
            String input = sc.nextLine();
            if (input.equals("그만")) 
            break;

            int ret = countSpace(input);
            System.out.println(" 어절 개수는 " + ret);
       
        }
    }
}
