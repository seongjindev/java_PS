package basicmath;

import java.io.*;

//public class A5426 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        for (int i = 0; i < t; i++) {
//            StringBuilder sb = new StringBuilder();
//            String s = br.readLine();
//            int r = (int)Math.sqrt(s.length());
//            for (int j = 1; j <= r; j++) {
//                for (int k = 1; k <= r; k++) {
//                    String ss = s.substring((r * k) - j, (r * k) - j + 1);
//                    sb.append(ss);
//                }
//            }
//            System.out.println(sb);
//        }
//        br.close();
//    }
//}

//public class A5426 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        for (int i = 0; i < t; i++) {
//            StringBuilder sb = new StringBuilder();
//            String s = br.readLine();
//            int r = (int)Math.sqrt(s.length());
//            for (int j = 1; j <= r; j++) {
//                for (int k = 1; k <= r; k++) {
//                    char c = s.charAt((r * k) - j);
//                    sb.append(c);
//                }
//            }
//            System.out.println(sb);
//        }
//        br.close();
//    }
//}

public class A5426 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            int r = (int)Math.sqrt(s.length());
            for (int j = 1; j <= r; j++) {
                for (int k = 1; k <= r; k++) {
                    char c = s.charAt((r * k) - j);
                    bw.write(c);
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}