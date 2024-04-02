package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A4504 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//        while (true) {
//            int in = Integer.parseInt(br.readLine());
//            if (in == 0) {
//                break;
//            }
//            if (in % n == 0) {
//                sb.append(in).append(" is a multiple of ").append(n).append(".\n");
//            } else {
//                sb.append(in).append(" is NOT a multiple of ").append(n).append(".\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A4504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while (true) {
            int in = Integer.parseInt(br.readLine());
            if (in == 0) {
                break;
            }
            sb.append(in);
            if (in % n == 0) {
                sb.append(" is a multiple of ");
            } else {
                sb.append(" is NOT a multiple of ");
            }
            sb.append(n).append(".\n");
        }
        System.out.println(sb);
        br.close();
    }
}
