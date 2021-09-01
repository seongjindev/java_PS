package class2;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.StringTokenizer;
//
//public class A10814 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//        String[][] id = new String[cnt][2];
//        for (int i = 0; i < cnt; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            id[i][0] = st.nextToken();
//            id[i][1] = st.nextToken();
//        }
//        Arrays.sort(id, new Comparator<String[]>() {
//            @Override
//            public int compare(String[] o1, String[] o2) {
//                if(o1[0]==o2[0]) {
//                    return o1[1].compareTo(o2[1]);
//                }else {
//
//                    return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
//                }
//            }
//        });
//        for (int i = 0; i < cnt; i++) {
//            System.out.println(id[i][0] + " " + id[i][1]);
//        }
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class A10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[][] id = new String[cnt][2];
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            id[i][0] = st.nextToken();
            id[i][1] = st.nextToken();
        }
        Arrays.sort(id, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });
        for (int i = 0; i < cnt; i++) {
            System.out.println(id[i][0] + " " + id[i][1]);
        }
        br.close();
    }
}
