package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A10953 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int tc = Integer.parseInt(br.readLine());
//        for (int i = 0; i < tc; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
//            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            String[] sp = br.readLine().split(",");
            int sum = Integer.parseInt(sp[0]) + Integer.parseInt(sp[1]);
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}