package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//public class A28062 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<Integer> odd = new ArrayList<>();
//        int sum = 0;
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            int cd = Integer.parseInt(st.nextToken());
//            if (cd % 2 == 0) {
//                sum += cd;
//            } else {
//                odd.add(cd);
//            }
//        }
//        if (odd.size() % 2 == 0) {
//            for (int i = 0; i < odd.size(); i++) {
//                sum += odd.get(i);
//            }
//        } else {
//            odd.sort(Collections.reverseOrder());
//            for (int i = 0; i < odd.size() - 1; i++) {
//                sum += odd.get(i);
//            }
//        }
//        System.out.println(sum);
//        br.close();
//    }
//}

public class A28062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> odd = new ArrayList<>();
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int cd = Integer.parseInt(st.nextToken());
            if (cd % 2 == 0) {
                sum += cd;
            } else {
                odd.add(cd);
            }
        }
        int ck = 0;
        if (odd.size() % 2 == 1) {
            odd.sort(Collections.reverseOrder());
            ck = 1;
        }
        for (int i = 0; i < odd.size() - ck; i++) {
            sum += odd.get(i);
        }
        System.out.println(sum);
        br.close();
    }
}
