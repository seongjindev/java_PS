package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A10419 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int t = Integer.parseInt(br.readLine());
//        for (int i = 0; i < t; i++) {
//            int d = Integer.parseInt(br.readLine());
//            int sq = (int) Math.sqrt(d);
//            for (int j = sq; j >= 0; j--) {
//                if (j + (j * j) <= d) {
//                    sb.append(j).append("\n");
//                    break;
//                }
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A10419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int d = Integer.parseInt(br.readLine());
            for (int j = (int) Math.sqrt(d); j >= 0; j--) {
                if (j + (j * j) <= d) {
                    sb.append(j).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}