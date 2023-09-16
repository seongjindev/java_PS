package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Comparator;

//public class A2204 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        while (true) {
//            int n = Integer.parseInt(br.readLine());
//            if (n == 0) {
//                break;
//            }
//            String[][] arr = new String[n][n];
//            for (int i = 0; i < n; i++) {
//                String in = br.readLine();
//                arr[i][0] = in.toUpperCase();
//                arr[i][1] = in;
//            }
//            Arrays.sort(arr, new Comparator<String[]>() {
//                @Override
//                public int compare(String[] o1, String[] o2) {
//                    return o1[0].compareTo(o2[0]);
//                }
//            });
//            sb.append(arr[0][1]).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A2204 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        while (true) {
//            int n = Integer.parseInt(br.readLine());
//            if (n == 0) {
//                break;
//            }
//            String[][] arr = new String[n][n];
//            for (int i = 0; i < n; i++) {
//                arr[i][1] = br.readLine();
//                arr[i][0] = arr[i][1].toUpperCase();
//            }
//            Arrays.sort(arr, Comparator.comparing(o -> o[0]));
//            sb.append(arr[0][1]).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A2204 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        while (true) {
//            int n = Integer.parseInt(br.readLine());
//            if (n == 0) {
//                break;
//            }
//            TreeMap<String, String> tm = new TreeMap<>();
//            for (int i = 0; i < n; i++) {
//                String in = br.readLine();
//                tm.put(in.toUpperCase(), in);
//            }
//            sb.append(tm.get(tm.firstKey())).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A2204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine();
            }
            Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
            sb.append(arr[0]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}