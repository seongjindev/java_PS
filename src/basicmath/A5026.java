package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A5026 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            String[] sp = br.readLine().split("\\+");
//            if (sp.length > 1) {
//                sb.append(Integer.parseInt(sp[0]) + Integer.parseInt(sp[1])).append("\n");
//            } else {
//                sb.append("skipped").append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A5026 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            String s = br.readLine();
//            if (s.equals("P=NP")) {
//                sb.append("skipped").append("\n");
//            } else {
//                String[] sp = s.split("\\+");
//                sb.append(Integer.parseInt(sp[0]) + Integer.parseInt(sp[1])).append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A5026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] sp = br.readLine().split("\\+");
            if (sp[0].equals("P=NP")) {
                sb.append("skipped").append("\n");
            } else {
                sb.append(Integer.parseInt(sp[0]) + Integer.parseInt(sp[1])).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}