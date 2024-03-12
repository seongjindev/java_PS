package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A4880 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        while (true) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int a1 = Integer.parseInt(st.nextToken());
//            int a2 = Integer.parseInt(st.nextToken());
//            int a3 = Integer.parseInt(st.nextToken());
//            if (a1 == 0 && a2 == 0 && a3 == 0) {
//                break;
//            }
//            if (a2 - a1 == a3 - a2) {
//                sb.append("AP ").append(a2 - a1 + a3).append("\n");
//            } else {
//                sb.append("GP ").append(a2 / a1 * a3).append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A4880 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());
            if (a1 == 0 && a3 == 0) {
                break;
            }
            if (a2 - a1 == a3 - a2) {
                sb.append("AP ").append(a2 - a1 + a3).append("\n");
            } else {
                sb.append("GP ").append(a2 / a1 * a3).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
