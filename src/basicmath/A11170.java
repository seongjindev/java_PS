package basicmath;

import java.io.*;
import java.util.StringTokenizer;

//public class A11170 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int t = Integer.parseInt(br.readLine());
//        for (int i = 0; i < t; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            int m = Integer.parseInt(st.nextToken());
//            int cnt = 0;
//            for (int j = n; j <= m; j++) {
//                String num = String.valueOf(j);
//                for (int k = 0; k < num.length(); k++) {
//                    if (num.charAt(k) == '0') {
//                        cnt++;
//                    }
//                }
//            }
//            bw.write(cnt + "\n");
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}

public class A11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int j = n; j <= m; j++) {
                int cal = j;
                while (true) {
                    if (cal % 10 == 0) {
                        cnt++;
                    }
                    cal /= 10;
                    if (cal == 0) {
                        break;
                    }
                }
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
