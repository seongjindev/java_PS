package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

//public class A20124 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[][] arr = new String[n][2];
//        for (int i = 0; i < n; i++) {
//            String[] sp = br.readLine().split(" ");
//            arr[i] = sp;
//        }
//        Arrays.sort(arr, (o1, o2) -> {
//            if (o1[1].equals(o2[1])) {
//                return o1[0].compareTo(o2[0]);
//            }
//            return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
//        });
//        System.out.println(arr[0][0]);
//        br.close();
//    }
//}

//public class A20124 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] in = br.readLine().split(" ");
//        String nm = in[0];
//        int max = Integer.parseInt(in[1]);
//        for (int i = 1; i < n; i++) {
//            String[] sp = br.readLine().split(" ");
//            if (max < Integer.parseInt(sp[1])) {
//                max = Integer.parseInt(sp[1]);
//                nm = sp[0];
//            } else if (max == Integer.parseInt(sp[1])){
//                if (nm.compareTo(sp[0]) > 0) {
//                    max = Integer.parseInt(sp[1]);
//                    nm = sp[0];
//                }
//            }
//        }
//        System.out.println(nm);
//        br.close();
//    }
//}

//public class A20124 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String nm = "";
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            String[] sp = br.readLine().split(" ");
//            if (max < Integer.parseInt(sp[1])) {
//                max = Integer.parseInt(sp[1]);
//                nm = sp[0];
//            } else if (max == Integer.parseInt(sp[1])){
//                if (nm.compareTo(sp[0]) > 0) {
//                    nm = sp[0];
//                }
//            }
//        }
//        System.out.println(nm);
//        br.close();
//    }
//}

//public class A20124 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String cm = "";
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            String nm = st.nextToken();
//            int score = Integer.parseInt(st.nextToken());
//            if (max < score) {
//                max = score;
//                cm = nm;
//            } else if (max == score){
//                if (cm.compareTo(nm) > 0) {
//                    cm = nm;
//                }
//            }
//        }
//        System.out.println(cm);
//        br.close();
//
//    }
//}

public class A20124 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String cm = "";
        int max = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String nm = st.nextToken();
            String score = st.nextToken();
            if (max < Integer.parseInt(score)) {
                max = Integer.parseInt(score);
                cm = nm;
            } else if (max == Integer.parseInt(score)){
                if (cm.compareTo(nm) > 0) {
                    cm = nm;
                }
            }
        }
        System.out.println(cm);
        br.close();
    }
}