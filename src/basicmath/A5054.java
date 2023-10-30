package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

//public class A5054 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            int n = Integer.parseInt(br.readLine());
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int[] mk = new int[n];
//            for (int j = 0; j < n; j++) {
//                mk[j] = Integer.parseInt(st.nextToken());
//            }
//            Arrays.sort(mk);
//            int sum = 0;
//            for (int j = 1; j < n; j++) {
//                sum += mk[j] - mk[j - 1];
//            }
//            sum += mk[n - 1] - mk[0];
//            sb.append(sum).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A5054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = 0;
            int min = 201;
            for (int j = 0; j < n; j++) {
                int dis = Integer.parseInt(st.nextToken());
                max = Math.max(max, dis);
                min = Math.min(min, dis);
            }
            sb.append((max - min) * 2).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}