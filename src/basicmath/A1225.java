package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A1225 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        String a = st.nextToken();
//        String b = st.nextToken();
//        long sum = 0;
//        for (int i = 0; i < a.length(); i++) {
//            int aa = a.charAt(i) - '0';
//            for (int j = 0; j < b.length(); j++) {
//                sum += (long) aa * (b.charAt(j) - '0');
//            }
//        }
//        System.out.println(sum);
//        br.close();
//    }
//}

public class A1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        long sum = 0;
        for (int i = 0; i < a.length(); i++) {
            long aa = a.charAt(i) - '0';
            for (int j = 0; j < b.length(); j++) {
                sum += aa * (b.charAt(j) - '0');
            }
        }
        System.out.println(sum);
        br.close();
    }
}
