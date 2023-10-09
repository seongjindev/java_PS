package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//public class A10384 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            HashMap<Character, Integer> hm = new HashMap<>();
//            String input = br.readLine().toLowerCase();
//            for (int j = 0; j < input.length(); j++) {
//                char c = input.charAt(j);
//                if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
//                    hm.put(c, hm.getOrDefault(c, 0) + 1);
//                }
//            }
//            int min = 3;
//            for (Character c : hm.keySet()) {
//                if (hm.get(c) < min) {
//                    min = hm.get(c);
//                }
//            }
//            sb.append("Case ").append(i + 1).append(": ");
//            String rst = "Not a pangram";
//            if (min == 1 && hm.size() == 26) {
//                rst = "Pangram!";
//            } else if (min == 2 && hm.size() == 26) {
//                rst = "Double pangram!!";
//            } else if (min == 3 && hm.size() == 26) {
//                rst = "Triple pangram!!!";
//            }
//            sb.append(rst).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A10384 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int[] ck = new int[26];
            String input = br.readLine().toLowerCase();
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                if (c >= 65 && c <= 90) {
                    ck[c - 65]++;
                } else if (c >= 97 && c <= 122) {
                    ck[c - 97]++;
                }
            }
            int min = 3;
            for (int k : ck) {
                min = Math.min(min, k);
            }
            sb.append("Case ").append(i + 1).append(": ");
            String rst = "Not a pangram";
            if (min == 1) {
                rst = "Pangram!";
            } else if (min == 2) {
                rst = "Double pangram!!";
            } else if (min == 3) {
                rst = "Triple pangram!!!";
            }
            sb.append(rst).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}