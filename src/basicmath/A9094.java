package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A9094 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int tc = Integer.parseInt(br.readLine());
//        for (int i = 0; i < tc; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            int m = Integer.parseInt(st.nextToken());
//            int sum = 0;
//            for (int b = n - 1; b > 1; b--) {
//                for (int a = 1; a < b; a++) {
//                    if (((a * a) + (b * b) + m) % (a * b) == 0) {
//                        sum++;
//                    }
//                }
//            }
//            sb.append(sum).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int sum = 0;
            for (int b = 2; b < n; b++) {
                for (int a = 1; a < b; a++) {
                    if (((a * a) + (b * b) + m) % (a * b) == 0) {
                        sum++;
                    }
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
