package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A2460 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int max = 0;
//        int user = 0;
//        for (int i = 0; i < 10; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int out = Integer.parseInt(st.nextToken());
//            int in = Integer.parseInt(st.nextToken());
//            user = Math.max(user - out + in, 0);
//            max = Math.max(max, user);
//        }
//        System.out.println(max);
//        br.close();
//    }
//}

public class A2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int user = 0;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());
            user = user - out + in;
            max = Math.max(max, user);
        }
        System.out.println(max);
        br.close();
    }
}
