package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A15780 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        int sum = 0;
//        for (int i = 0; i < k; i++) {
//            int c = Integer.parseInt(st.nextToken());
//            if (c % 2 == 0) {
//                sum += c / 2;
//            } else {
//                sum += (c / 2) + 1;
//            }
//        }
//        if (sum >= n) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//        br.close();
//    }
//}

public class A15780 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String rst = "NO";
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int c = Integer.parseInt(st.nextToken());
            if (c % 2 == 0) {
                sum += c / 2;
            } else {
                sum += (c / 2) + 1;
            }
            if (sum >= n) {
                rst = "YES";
                break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}