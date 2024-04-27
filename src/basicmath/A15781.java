package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

//public class A15781 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        br.readLine();
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int hd = 0;
//        while (st.hasMoreTokens()) {
//            int in = Integer.parseInt(st.nextToken());
//            hd = Math.max(hd, in);
//        }
//        st = new StringTokenizer(br.readLine());
//        int ct = 0;
//        while (st.hasMoreTokens()) {
//            int in = Integer.parseInt(st.nextToken());
//            ct = Math.max(ct, in);
//        }
//        System.out.println(hd + ct);
//        br.close();
//    }
//}

//public class A15781 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        br.readLine();
//        String[] sp1 = br.readLine().split(" ");
//        String[] sp2 = br.readLine().split(" ");
//        Arrays.sort(sp1, (o1, o2) -> Integer.parseInt(o2) - Integer.parseInt(o1));
//        Arrays.sort(sp2, (o1, o2) -> Integer.parseInt(o2) - Integer.parseInt(o1));
//        System.out.println(Integer.parseInt(sp1[0]) + Integer.parseInt(sp2[0]));
//        br.close();
//    }
//}

public class A15781 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int hd = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).max().orElse(0);
        int ct = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).max().orElse(0);
        System.out.println(hd + ct);
        br.close();
    }
}