package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A14912 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int d = Integer.parseInt(st.nextToken());
//        int rst = 0;
//        for (int i = 1; i <= n; i++) {
//            String s = String.valueOf(i);
//            for (int j = 0; j < s.length(); j++) {
//                if (s.charAt(j) == (char)(d + '0')) {
//                    rst++;
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A14912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int rst = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num != 0) {
                if (num % 10 == d) {
                    rst++;
                }
                num /= 10;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
