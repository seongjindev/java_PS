package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;

//public class A10825 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[][] arr = new String[n][4];
//        StringTokenizer st;
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            arr[i][0] = st.nextToken();
//            arr[i][1] = st.nextToken();
//            arr[i][2] = st.nextToken();
//            arr[i][3] = st.nextToken();
//        }
//        StringBuilder sb = new StringBuilder();
//        Arrays.sort(arr, new Comparator<String[]>() {
//            @Override
//            public int compare(String[] o1, String[] o2) {
//                if (o1[1].equals(o2[1])) {
//                    if (o1[2].equals(o2[2])) {
//                        if (o1[3].equals(o2[3])) {
//                            return o1[0].compareTo(o2[0]);
//                        } else {
//                            return Integer.compare(Integer.parseInt(o2[3]), Integer.parseInt(o1[3]));
//                        }
//                    } else {
//                        return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
//                    }
//                }
//                return Integer.compare(Integer.parseInt(o2[1]), Integer.parseInt(o1[1]));
//            }
//        });
//        for (int i = 0; i < n; i++) {
//            sb.append(arr[i][0]).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][4];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1].equals(o2[1])) {
                if (o1[2].equals(o2[2])) {
                    if (o1[3].equals(o2[3])) {
                        return o1[0].compareTo(o2[0]);
                    } else {
                        return Integer.compare(Integer.parseInt(o2[3]), Integer.parseInt(o1[3]));
                    }
                } else {
                    return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
                }
            }
            return Integer.compare(Integer.parseInt(o2[1]), Integer.parseInt(o1[1]));
        });
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}