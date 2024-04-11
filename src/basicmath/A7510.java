package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A7510 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int tc = Integer.parseInt(br.readLine());
//        for (int i = 1; i <= tc; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            long a = (long) Math.pow(Long.parseLong(st.nextToken()), 2);
//            long b = (long) Math.pow(Long.parseLong(st.nextToken()), 2);
//            long c = (long) Math.pow(Long.parseLong(st.nextToken()), 2);
//            long max = Math.max(Math.max(a, b), c);
//            sb.append("Scenario #").append(i).append(":\n");
//            if (a + b + c - max == max) {
//                sb.append("yes");
//            } else {
//                sb.append("no");
//            }
//            sb.append("\n\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A7510 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int tc = Integer.parseInt(br.readLine());
//        for (int i = 1; i <= tc; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            long sum = 0;
//            long max = 0;
//            for (int j = 0; j < 3; j++) {
//                long num = Long.parseLong(st.nextToken());
//                sum += num * num;
//                max = Math.max(max, num * num);
//            }
//            sb.append("Scenario #").append(i).append(":\n");
//            if (sum - max == max) {
//                sb.append("yes");
//            } else {
//                sb.append("no");
//            }
//            sb.append("\n\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A7510 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 1; i <= tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long sum = 0;
            long max = 0;
            for (int j = 0; j < 3; j++) {
                long num = (long) Math.pow(Long.parseLong(st.nextToken()), 2);
                sum += num;
                max = Math.max(max, num);
            }
            sb.append("Scenario #").append(i).append(":\n");
            if (sum - max == max) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n\n");
        }
        System.out.println(sb);
        br.close();
    }
}
