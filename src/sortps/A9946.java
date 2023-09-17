package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//public class A9946 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int c = 1;
//        while (true) {
//            String s1 = br.readLine();
//            String s2 = br.readLine();
//            if (s1.equals("END") && s2.equals("END")) {
//                break;
//            }
//            sb.append("Case ").append(c).append(": ");
//            c++;
//            String rst = "same";
//            if (s1.length() == s2.length()) {
//                char[] ch1 = s1.toCharArray();
//                char[] ch2 = s2.toCharArray();
//                Arrays.sort(ch1);
//                Arrays.sort(ch2);
//                for (int i = 0; i < ch1.length; i++) {
//                    if (ch1[i] != ch2[i]) {
//                        rst = "different";
//                        break;
//                    }
//                }
//            } else {
//                rst = "different";
//            }
//            sb.append(rst).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A9946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int c = 1;
        while (true) {
            String s1 = br.readLine();
            String s2 = br.readLine();
            if (s1.equals("END") && s2.equals("END")) {
                break;
            }
            sb.append("Case ").append(c).append(": ");
            c++;
            String rst = "same";
            if (s1.length() == s2.length()) {
                int[] cnt = new int[26];
                for (int i = 0; i < s1.length(); i++) {
                    cnt[s1.charAt(i) - 'a']++;
                    cnt[s2.charAt(i) - 'a']--;
                }
                for (int i = 0; i < 26; i++) {
                    if (cnt[i] != 0) {
                        rst = "different";
                        break;
                    }
                }
            } else {
                rst = "different";
            }
            sb.append(rst).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}