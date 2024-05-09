package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A27960 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int[] tg = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
//        int rst = 0;
//        for (int i = 9; i >= 0; i--) {
//            int chk = 0;
//            if (a > tg[i]) {
//                a -= tg[i];
//                chk++;
//            }
//            if (b > tg[i]) {
//                b -= tg[i];
//                chk++;
//            }
//            if (chk == 1) rst += tg[i];
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A27960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(a ^ b);
        br.close();
    }
}
