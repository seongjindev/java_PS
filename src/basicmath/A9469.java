package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A9469 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int p = Integer.parseInt(br.readLine());
//        for (int i = 0; i < p; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            double d = Double.parseDouble(st.nextToken());
//            double a = Double.parseDouble(st.nextToken());
//            double b = Double.parseDouble(st.nextToken());
//            double f = Double.parseDouble(st.nextToken());
//            double s = (d / (a + b)) * f;
//            sb.append(n).append(" ").append(String.format("%f", s)).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A9469 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int p = Integer.parseInt(br.readLine());
        for (int i = 0; i < p; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            double d = Double.parseDouble(st.nextToken());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double f = Double.parseDouble(st.nextToken());
            sb.append(n).append(" ").append(String.format("%f", (d / (a + b)) * f)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}