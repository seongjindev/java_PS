package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A7789 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int be = Integer.parseInt(st.nextToken());
//        int af = Integer.parseInt(st.nextToken()) * 1000000 + be;
//        boolean beCk = true;
//        boolean afCk = true;
//        for (int i = 2; i < af; i++) {
//            if (i < be) {
//                if (be % i == 0) {
//                    beCk = false;
//                    break;
//                }
//            }
//            if (af % i == 0) {
//                afCk = false;
//                break;
//            }
//        }
//        if (beCk && afCk) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//        br.close();
//    }
//}

//public class A7789 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int be = Integer.parseInt(st.nextToken());
//        int af = Integer.parseInt(st.nextToken()) * 1000000 + be;
//        boolean beCk = true;
//        boolean afCk = true;
//        for (int i = 2; i < Math.sqrt(af); i++) {
//            if (i < be) {
//                if (be % i == 0) {
//                    beCk = false;
//                    break;
//                }
//            }
//            if (af % i == 0) {
//                afCk = false;
//                break;
//            }
//        }
//        if (beCk && afCk) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//        br.close();
//    }
//}

public class A7789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int be = Integer.parseInt(st.nextToken());
        int af = Integer.parseInt(st.nextToken()) * 1000000 + be;
        String rst = "Yes";
        for (int i = 2; i < Math.sqrt(af); i++) {
            if (i < be) {
                if (be % i == 0) {
                    rst = "No";
                    break;
                }
            }
            if (af % i == 0) {
                rst = "No";
                break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
