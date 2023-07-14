package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//public class A10815 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] chk = new int[20000001];
//        for (int i = 0; i < n; i++) {
//            chk[Integer.parseInt(st.nextToken()) + 10000000]++;
//        }
//        int m = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < m; i++) {
//            if (chk[Integer.parseInt(st.nextToken()) + 10000000] > 0) {
//                sb.append(1).append(" ");
//            } else {
//                sb.append(0).append(" ");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(Integer.parseInt(st.nextToken()), false);
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            if (hm.containsKey(Integer.parseInt(st.nextToken()))) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}