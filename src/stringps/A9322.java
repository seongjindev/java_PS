package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

//public class A9322 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int tc = Integer.parseInt(br.readLine());
//        HashMap<Integer, Integer> hm = new LinkedHashMap<>();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < tc ; i++) {
//            int n = Integer.parseInt(br.readLine());
//            String[] fir = new String[n];
//            String[] snd = new String[n];
//            String[] thd = new String[n];
//            String[] rst = new String[n];
//            StringTokenizer st1 = new StringTokenizer(br.readLine());
//            StringTokenizer st2 = new StringTokenizer(br.readLine());
//            StringTokenizer st3 = new StringTokenizer(br.readLine());
//            for (int j = 0; j < n ; j++) {
//                fir[j] = st1.nextToken();
//                snd[j] = st2.nextToken();
//                thd[j] = st3.nextToken();
//            }
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < n; k++) {
//                    if (fir[j].equals(snd[k])) {
//                        hm.put(j, k);
//                        break;
//                    }
//                }
//            }
//            for (int j = 0; j < n; j++) {
//                rst[j] = thd[hm.get(j)];
//            }
//            for (String j : rst) {
//                sb.append(j).append(" ");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A9322 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int tc = Integer.parseInt(br.readLine());
//        StringTokenizer st;
//        StringTokenizer st2;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < tc ; i++) {
//            int n = Integer.parseInt(br.readLine());
//            st = new StringTokenizer(br.readLine());
//            HashMap<String, Integer> hm = new LinkedHashMap<>();
//            for (int j = 0; j < n; j++) {
//                hm.put(st.nextToken(), j);
//            }
//            st = new StringTokenizer(br.readLine());
//            st2 = new StringTokenizer(br.readLine());
//            String[] rst = new String[n];
//            for (int j = 0; j < n; j++) {
//                String in = st.nextToken();
//                rst[hm.get(in)] = st2.nextToken();
//            }
//            for (String j : rst) {
//                sb.append(j).append(" ");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A9322 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringTokenizer st2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc ; i++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            HashMap<String, Integer> hm = new LinkedHashMap<>();
            for (int j = 0; j < n; j++) {
                hm.put(st.nextToken(), j);
            }
            st = new StringTokenizer(br.readLine());
            st2 = new StringTokenizer(br.readLine());
            String[] rst = new String[n];
            for (int j = 0; j < n; j++) {
                rst[hm.get(st.nextToken())] = st2.nextToken();
            }
            for (String j : rst) {
                sb.append(j).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}