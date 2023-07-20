package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//public class A7795 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            int m = Integer.parseInt(st.nextToken());
//            int[] a = new int[n];
//            int[] b = new int[m];
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < n; j++) {
//                a[j] = Integer.parseInt(st.nextToken());
//            }
//            st = new StringTokenizer(br.readLine());
//            for (int k = 0; k < m; k++) {
//                b[k] = Integer.parseInt(st.nextToken());
//            }
//            Arrays.sort(a);
//            Arrays.sort(b);
//            int sum = 0;
//            for (int r = n - 1; r >= 0; r--) {
//                for (int s = m - 1; s >= 0; s--) {
//                    if (a[r] > b[s]) {
//                        sum += s + 1;
//                        break;
//                    }
//                }
//            }
//            sb.append(sum).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            int[] b = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < m; k++) {
                b[k] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int sum = 0;
            int bc = m - 1;
            for (int r = n - 1; r >= 0; r--) {
                for (int s = bc; s >= 0; s--) {
                    if (a[r] > b[s]) {
                        sum += s + 1;
                        bc = s;
                        break;
                    }
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}