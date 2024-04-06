package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

//public class A9366 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int tc = Integer.parseInt(br.readLine());
//        for (int i = 0; i < tc; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int[] tri = new int[3];
//            for (int j = 0; j < 3; j++) {
//                tri[j] = Integer.parseInt(st.nextToken());
//            }
//            Arrays.sort(tri);
//            sb.append("Case #").append(i + 1);
//            if (tri[0] == tri[2]) {
//                sb.append(": equilateral");
//            } else if (tri[0] + tri[1] <= tri[2]) {
//                sb.append(": invalid!");
//            } else if (tri[0] == tri[1] || tri[1] == tri[2]) {
//                sb.append(": isosceles");
//            } else {
//                sb.append(": scalene");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A9366 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int max = Math.max(Math.max(a, b), c);
            sb.append("Case #").append(i + 1);
            if (a == b && b == c) {
                sb.append(": equilateral");
            } else if (a + b + c - max <= max) {
                sb.append(": invalid!");
            } else if (a == b || b == c || a == c) {
                sb.append(": isosceles");
            } else {
                sb.append(": scalene");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}