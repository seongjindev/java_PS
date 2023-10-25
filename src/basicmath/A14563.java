package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A14563 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            int num = Integer.parseInt(st.nextToken());
//            int sum = 0;
//            for (int j = 1; j < num; j++) {
//                if (num % j == 0) {
//                    sum += j;
//                }
//            }
//            if (sum > num) {
//                sb.append("Abundant").append("\n");
//            } else if (sum < num) {
//                sb.append("Deficient").append("\n");
//            } else {
//                sb.append("Perfect").append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A14563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(st.nextToken());
            int sum = 0;
            for (int j = 1; j < num / 2 + 1; j++) {
                if (num % j == 0) {
                    sum += j;
                }
            }
            if (sum > num) {
                sb.append("Abundant").append("\n");
            } else if (sum < num) {
                sb.append("Deficient").append("\n");
            } else {
                sb.append("Perfect").append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
