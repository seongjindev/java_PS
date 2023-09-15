package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;

//public class A11557 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            int n = Integer.parseInt(br.readLine());
//            String[][] arr = new String[n][2];
//            for (int j = 0; j < n; j++) {
//                StringTokenizer st = new StringTokenizer(br.readLine());
//                arr[j][0] = st.nextToken();
//                arr[j][1] = st.nextToken();
//            }
//            Arrays.sort(arr, new Comparator<String[]>() {
//                @Override
//                public int compare(String[] o1, String[] o2) {
//                    return Integer.compare(Integer.parseInt(o2[1]), Integer.parseInt(o1[1]));
//                }
//            });
//            sb.append(arr[0][0]).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A11557 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            int n = Integer.parseInt(br.readLine());
//            String[][] arr = new String[n][2];
//            for (int j = 0; j < n; j++) {
//                StringTokenizer st = new StringTokenizer(br.readLine());
//                arr[j][0] = st.nextToken();
//                arr[j][1] = st.nextToken();
//            }
//            Arrays.sort(arr, new Comparator<String[]>() {
//                @Override
//                public int compare(String[] o1, String[] o2) {
//                    return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
//                }
//            });
//            sb.append(arr[0][0]).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A11557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[][] arr = new String[n][2];
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[j][0] = st.nextToken();
                arr[j][1] = st.nextToken();
            }
            Arrays.sort(arr, (o1, o2) -> Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]));
            sb.append(arr[0][0]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}