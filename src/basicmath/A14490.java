package basicmath;

import java.io.*;
import java.util.StringTokenizer;

//public class A14490 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int min = n;
//        if (n >= m) {
//            min = m;
//        }
//        for (int i = min; i > 0; i--) {
//            if (n % i == 0 && m % i == 0) {
//                System.out.println(n / i + ":" + m / i);
//                break;
//            }
//        }
//        br.close();
//    }
//}

//public class A14490 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int min = Math.min(n, m);
//        for (int i = min; i > 0; i--) {
//            if (n % i == 0 && m % i == 0) {
//                bw.write(n/i + ":" + m/i);
//                break;
//            }
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}

public class A14490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        while (max % min != 0) {
            int i = max % min;
            max = min;
            min = i;
        }
        bw.write(n/min + ":" + m/min);
        bw.flush();
        bw.close();
        br.close();
    }
}