package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//public class A10599 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String in;
//        while (!(in = br.readLine()).equals("0 0 0 0")) {
//            StringTokenizer st = new StringTokenizer(in);
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            int c = Integer.parseInt(st.nextToken());
//            int d = Integer.parseInt(st.nextToken());
//            int min = Math.abs(c - b);
//            int max = Math.abs(d - a);
//            sb.append(min).append(" ").append(max).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A10599 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String in;
//        while (!(in = br.readLine()).equals("0 0 0 0")) {
//            int[] arr = Arrays.stream(in.split(" ")).mapToInt(Integer::parseInt).toArray();
//            int min = Math.abs(arr[2] - arr[1]);
//            int max = Math.abs(arr[3] - arr[0]);
//            sb.append(min).append(" ").append(max).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A10599 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String in;
        while (!(in = br.readLine()).equals("0 0 0 0")) {
            int[] arr = Arrays.stream(in.split(" ")).mapToInt(Integer::parseInt).toArray();
            int min = arr[2] - arr[1];
            int max = arr[3] - arr[0];
            sb.append(min).append(" ").append(max).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}