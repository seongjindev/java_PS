package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A3058 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int min = 100;
//            int sum = 0;
//            while (st.hasMoreTokens()) {
//                int num = Integer.parseInt(st.nextToken());
//                if (num % 2 == 0) {
//                    min = Math.min(min, num);
//                    sum += num;
//                }
//            }
//            sb.append(sum).append(" ").append(min).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = 100;
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num % 2 == 0) {
                    min = Math.min(min, num);
                    sum += num;
                }
            }
            sb.append(sum).append(" ").append(min).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}