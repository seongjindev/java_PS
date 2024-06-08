package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//public class A9085 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int t = Integer.parseInt(br.readLine());
//        for (int i = 0; i < t; i++) {
//            int n = Integer.parseInt(br.readLine());
//            int sum = 0;
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < n; j++) {
//                sum += Integer.parseInt(st.nextToken());
//            }
//            sb.append(sum).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A9085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            int[] sp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < n; j++) {
                sum += sp[j];
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
