package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A10409 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int t = Integer.parseInt(st.nextToken());
//        int cnt = 0;
//        int sum = 0;
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            int work = Integer.parseInt(st.nextToken());
//            if (sum + work > t) {
//                break;
//            }
//            sum += work;
//            cnt++;
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

//public class A10409 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int t = Integer.parseInt(st.nextToken());
//        int cnt = 0;
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            t -= Integer.parseInt(st.nextToken());
//            if (t < 0) {
//                break;
//            }
//            cnt++;
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

public class A10409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            t -= Integer.parseInt(st.nextToken());
            if (t < 0) break;
            cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}