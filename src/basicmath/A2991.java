package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A2991 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String[] dog = br.readLine().split(" ");
//        String[] de = br.readLine().split(" ");
//        for (int i = 0; i < 3; i++) {
//            int cnt = 0;
//            int p = Integer.parseInt(de[i]) % (Integer.parseInt(dog[0]) + Integer.parseInt(dog[1]));
//            if (p > 0 && p <= Integer.parseInt(dog[0])) {
//                cnt++;
//            }
//            p = Integer.parseInt(de[i]) % (Integer.parseInt(dog[2]) + Integer.parseInt(dog[3]));
//            if (p > 0 && p <= Integer.parseInt(dog[2])) {
//                cnt++;
//            }
//            sb.append(cnt).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A2991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] dog = br.readLine().split(" ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            int de = Integer.parseInt(st.nextToken());
            int cnt = 0;
            int t = de % (Integer.parseInt(dog[0]) + Integer.parseInt(dog[1]));
            if (t > 0 && t <= Integer.parseInt(dog[0])) {
                cnt++;
            }
            t = de % (Integer.parseInt(dog[2]) + Integer.parseInt(dog[3]));
            if (t > 0 && t <= Integer.parseInt(dog[2])) {
                cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
