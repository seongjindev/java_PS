package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

//public class A11728 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        st.nextToken();
//        StringBuilder sb = new StringBuilder();
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < 2; i++) {
//            st = new StringTokenizer(br.readLine());
//            while (st.hasMoreTokens()) {
//                arr.add(Integer.parseInt(st.nextToken()));
//            }
//        }
//        Collections.sort(arr);
//        for (int i : arr) {
//            sb.append(i).append(" ");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] aArr = new int[a + 1];
        int[] bArr = new int[b + 1];
        aArr[a] = Integer.MAX_VALUE;
        bArr[b] = Integer.MAX_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            aArr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            bArr[i] = Integer.parseInt(st.nextToken());
        }
        int ac = 0;
        int bc = 0;
        for (int i = 0; i < a + b; i++) {
            if (aArr[ac] <= bArr[bc]) {
                sb.append(aArr[ac]).append(" ");
                if (ac < a) {
                    ac++;
                }
            } else {
                sb.append(bArr[bc]).append(" ");
                if (bc < b) {
                    bc++;
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}