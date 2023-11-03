package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//public class A1864 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        HashMap<Character, Integer> hm = new HashMap<>();
//        StringBuilder sb = new StringBuilder();
//        hm.put('-', 0);
//        hm.put('\\', 1);
//        hm.put('(', 2);
//        hm.put('@', 3);
//        hm.put('?', 4);
//        hm.put('>', 5);
//        hm.put('&', 6);
//        hm.put('%', 7);
//        hm.put('/', -1);
//        while (true) {
//            String s = br.readLine();
//            if (s.equals("#")) break;
//            int sum = 0;
//            for (int i = 0; i < s.length(); i++) {
//                sum += hm.get(s.charAt(i)) * Math.pow(8 , s.length() - i - 1);
//            }
//            sb.append(sum).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A1864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s.equals("#")) break;
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int num = 0;
                switch (c) {
                    case '-':
                        num = 0;
                        break;
                    case '\\':
                        num = 1;
                        break;
                    case '(':
                        num = 2;
                        break;
                    case '@':
                        num = 3;
                        break;
                    case '?':
                        num = 4;
                        break;
                    case '>':
                        num = 5;
                        break;
                    case '&':
                        num = 6;
                        break;
                    case '%':
                        num = 7;
                        break;
                    case '/':
                        num = -1;
                        break;
                }
                sum += num * Math.pow(8 , s.length() - i - 1);
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}