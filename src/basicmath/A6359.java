package basicmath;

import java.io.*;

//public class A6359 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int c = Integer.parseInt(br.readLine());
//        for (int i = 0; i < c; i++) {
//            int n = Integer.parseInt(br.readLine()) + 1;
//            boolean[] room = new boolean[n];
//            for (int j = 2; j < n; j++) {
//                for (int k = 1; k < n; k++) {
//                    if (room[j * k]) {
//                        room[j * k] = false;
//                    } else {
//                        room[j * k] = true;
//                    }
//                    if (j * (k+1) >= n) {
//                        break;
//                    }
//                }
//            }
//            int cnt = 0;
//            for (int m = 1; m < n; m++) {
//                if (!room[m]) {
//                    cnt++;
//                }
//            }
//            System.out.println(cnt);
//        }
//        br.close();
//    }
//}

public class A6359 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            int n = Integer.parseInt(br.readLine()) + 1;
            boolean[] room = new boolean[n];
            int cnt = n - 1;
            for (int j = 2; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    if (room[j * k]) {
                        room[j * k] = false;
                        cnt++;
                    } else {
                        room[j * k] = true;
                        cnt--;
                    }
                    if (j * (k+1) >= n) {
                        break;
                    }
                }
            }
            System.out.println(cnt);
        }
        br.close();
    }
}
