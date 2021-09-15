package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A13413 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int tc = Integer.parseInt(br.readLine());
//        for (int i = 0; i < tc; i++) {
//            int n = Integer.parseInt(br.readLine());
//            String be = br.readLine();
//            String af = br.readLine();
//            int w = 0;
//            int b = 0;
//            int min = 100000;
//            for (int j = 0; j < n; j++) {
//                if (be.charAt(j) != af.charAt(j)) {
//                    if (be.charAt(j)=='W') {
//                        w++;
//                    }else {
//                        b++;
//                    }
//                }
//            }
//            min = Math.min(w, b);
//            min += (w > b) ? w-b : b-w;
//            sb.append(min + "\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A13413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            String be = br.readLine();
            String af = br.readLine();
            int w = 0;
            int b = 0;
            int max = 0;
            for (int j = 0; j < n; j++) {
                if (be.charAt(j) != af.charAt(j)) {
                    if (be.charAt(j)=='W') {
                        w++;
                    }else {
                        b++;
                    }
                }
            }
            max = Math.max(w, b);
            sb.append(max + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}
