package greedy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class A18310 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] home = new int[n];
//        for (int i = 0; i < n; i++) {
//            home[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(home);
//        int nUp = (int)Math.ceil((double)(n+1)/2);
//        int nDown = (int)Math.floor((double)(n+1)/2);
//        int up = home[nUp];
//        int down = home[nDown];
//        long upSum = 0;
//        long downSum = 0;
//        for (int i = 0; i < n; i++) {
//            upSum += Math.abs(up-home[i]);
//            downSum += Math.abs(down-home[i]);
//        }
//        if (downSum <= upSum) {
//            System.out.println(down);
//        }else {
//            System.out.println(up);
//        }
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A18310 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] home = new int[n];
        for (int i = 0; i < n; i++) {
            home[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(home);
        int rst = (int) Math.floor((double) (n + 1) / 2);
        System.out.println(home[rst-1]);
        br.close();
    }
}
