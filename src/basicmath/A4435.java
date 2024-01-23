package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A4435 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        int[] ga = {1, 2, 3, 3, 4, 10};
//        int[] sa = {1, 2, 2, 2, 3, 5, 10};
//        for (int i = 0; i < t; i++) {
//            int g = 0;
//            int s = 0;
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < 6; j++) {
//                g += Integer.parseInt(st.nextToken()) * ga[j];
//            }
//            st = new StringTokenizer(br.readLine());
//            for (int k = 0; k < 7; k++) {
//                s += Integer.parseInt(st.nextToken()) * sa[k];
//            }
//            if (g > s) {
//                sb.append("Battle ").append(i + 1).append(": Good triumphs over Evil\n");
//            } else if (g < s) {
//                sb.append("Battle ").append(i + 1).append(": Evil eradicates all trace of Good\n");
//            } else {
//                sb.append("Battle ").append(i + 1).append(": No victor on this battle field\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A4435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[] ga = {1, 2, 3, 3, 4, 10};
        int[] sa = {1, 2, 2, 2, 3, 5, 10};
        for (int i = 0; i < t; i++) {
            int g = 0;
            int s = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 6; j++) {
                g += Integer.parseInt(st.nextToken()) * ga[j];
            }
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < 7; k++) {
                s += Integer.parseInt(st.nextToken()) * sa[k];
            }
            if (g > s) {
                sb.append("Battle ").append(i + 1).append(": Good triumphs over Evil\n");
            } else if (g < s) {
                sb.append("Battle ").append(i + 1).append(": Evil eradicates all trace of Good\n");
            } else {
                sb.append("Battle ").append(i + 1).append(": No victor on this battle field\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
