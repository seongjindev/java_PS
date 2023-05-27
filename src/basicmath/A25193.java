package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A25193 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        char[] gg = br.readLine().toCharArray();
//        double cNum = 0;
//        double fNum = 0;
//        for (int i = 0; i < n; i++) {
//            if (gg[i] == 'C') {
//                cNum++;
//            } else {
//                fNum++;
//            }
//        }
//        System.out.println((int)Math.ceil(cNum/(fNum + 1)));
//        br.close();
//    }
//}

public class A25193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] gg = br.readLine().toCharArray();
        int cNum = 0;
        for (int i = 0; i < n; i++) {
            if (gg[i] == 'C') {
                cNum++;
            }
        }
        System.out.println(n/(n - cNum + 1));
        br.close();
    }
}
