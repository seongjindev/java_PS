package greedy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class A1105 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        String l = st.nextToken();
//        int il = Integer.parseInt(l);
//        int r = Integer.parseInt(st.nextToken());
//        int sum = 0;
//        for (int i = 0; i < l.length(); i++) {
//            if (l.charAt(i) == '8') {
//                int rst = Math.max((int)Math.pow(10, (l.length() - i - 1)), 1) * 9;
//                if (rst > r) {
//                    sum++;
//                }
//            }
//        }
//        System.out.println(sum);
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1105 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String l = st.nextToken();
        String r = st.nextToken();
        int ir = Integer.parseInt(r);
        int sum = 0;
        for (int i = 0; i < l.length(); i++) {
            if (l.charAt(i) == '8') {
                String s = l.substring(0, i);
                int rst = Math.max((int)Math.pow(10, (l.length() - i - 1)), 1) * 9;
                s += String.valueOf(rst);
                rst = Integer.parseInt(s);
                if (rst > ir) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
        br.close();
    }
}
