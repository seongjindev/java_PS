package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A9546 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            int k = Integer.parseInt(br.readLine());
//            long sum = 0;
//            for (int j = 0; j < k; j++) {
//                sum += 5;
//                sum *= 2;
//            }
//            sb.append(sum / 10).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A9546 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            int k = Integer.parseInt(br.readLine());
//            long sum = 0;
//            for (int j = 0; j < k; j++) {
//                sum = (sum + 5) * 2;
//            }
//            sb.append(sum / 10).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A9546 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            int k = Integer.parseInt(br.readLine());
//            long sum = 1;
//            for (int j = 1; j < k; j++) {
//                sum = (sum * 2) + 1;
//            }
//            sb.append(sum).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A9546 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            int k = Integer.parseInt(br.readLine());
//            int sum = 0;
//            for (int j = 0; j < k; j++) {
//                sum = (sum * 2) + 1;
//            }
//            sb.append(sum).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A9546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int sum = 1;
            for (int j = 1; j < k; j++) {
                sum = (sum * 2) + 1;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}