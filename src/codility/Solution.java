package codility;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java 8
        if (S.length() < 2) return -1;
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            boolean flag = true;
            if ('a' <= S.charAt(i) && S.charAt(i) <= 'z') {
                char in = (char) (S.charAt(i) - 32);
                for (int j = 0; j < S.length(); j++) {
                    if (in == S.charAt(j)) {
                        count++;
                        flag = false;
                        break;
                    }
                }
            } else if ('A' <= S.charAt(i) && S.charAt(i) <= 'Z') {
                char in = (char) (S.charAt(i) + 32);
                for (int j = 0; j < S.length(); j++) {
                    if (in == S.charAt(j)) {
                        count++;
                        flag = false;
                        break;
                    }
                }
            }else{
                break;
            }
            if (flag) break;
        }
        if (count < 2) return -1;
        return count;
    }

    public String solution(String message, int K) {
        // write your code in Java SE 11
        if (K >= message.length()) return message;
        String[] split = message.split("\\s+");
        String str = "";
        if (split[0].length() > K) return "";
        str = split[0];
        for (int i = 1; i < split.length; i++){
            if ((str + " " + split[i]).length() > K) return str;
            else str += " " + split[i];
        }
        return str;
    }
}
