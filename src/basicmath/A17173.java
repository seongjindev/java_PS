package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Iterator;

//public class A17173 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        int sum = 0;
//        HashSet<Integer> hs = new HashSet<>();
//        for (int i = 0; i < m; i++) {
//            int num = Integer.parseInt(st.nextToken());
//            int mul = 1;
//            while (num * mul <= n) {
//                hs.add(num * mul);
//                mul++;
//            }
//        }
//        Iterator<Integer> iter = hs.iterator();
//        while (iter.hasNext()) {
//            sum += iter.next();
//        }
//        System.out.println(sum);
//        br.close();
//    }
//}

public class A17173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % arr[j] == 0) {
                    sum += i;
                    break;
                }
            }
        }
        System.out.println(sum);
        br.close();
    }
}