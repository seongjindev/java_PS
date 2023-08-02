package prefixsumps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A2003 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[] arr = new int[n + 1];
//        st = new StringTokenizer(br.readLine());
//        for (int i = 1; i <= n; i++) {
//            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
//        }
//        int rst = 0;
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j <= n; j++) {
//                int sum = arr[j] - arr[i - 1];
//                if (sum == m) {
//                    rst++;
//                } else if (sum > m) {
//                    break;
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int rst = 0;
        int lt = 0;
        int rt = 0;
        int sum = 0;
        while (true) {
            if (sum < m) {
                if (rt >= n) {
                    break;
                }
                sum += arr[rt++];
            } else {
                sum -= arr[lt++];
            }
            if (sum == m) {
                rst++;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
