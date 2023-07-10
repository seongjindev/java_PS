package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class A1755 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        int m = Integer.parseInt(st.nextToken());
//        int n = Integer.parseInt(st.nextToken());
//        String[][] rst = new String[n - m + 1][2];
//        int cnt = 0;
//        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
//        for (int i = m; i <= n; i++) {
//            String in = String.valueOf(i);
//            rst[cnt][0] = "";
//            for (int j = 0; j < in.length(); j++) {
//                rst[cnt][0] += arr[Integer.parseInt(in.substring(j, j + 1))];
//            }
//            rst[cnt][1] = in;
//            cnt++;
//        }
//        Arrays.sort(rst, new Comparator<String[]>() {
//            @Override
//            public int compare(String[] o1, String[] o2) {
//                return o1[0].compareTo(o2[0]);
//            }
//        });
//        int row = 0;
//        for (int i = 0; i < cnt; i++) {
//            sb.append(rst[i][1]).append(" ");
//            row++;
//            if (row == 10) {
//                row = 0;
//                sb.append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A1755 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        int m = Integer.parseInt(st.nextToken());
//        int n = Integer.parseInt(st.nextToken());
//        String[][] rst = new String[n - m + 1][2];
//        int cnt = 0;
//        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
//        for (int i = m; i <= n; i++) {
//            String in = String.valueOf(i);
//            rst[cnt][0] = "";
//            for (int j = 0; j < in.length(); j++) {
//                rst[cnt][0] += arr[Integer.parseInt(in.substring(j, j + 1))];
//            }
//            rst[cnt][1] = in;
//            cnt++;
//        }
//        Arrays.sort(rst, (o1, o2) -> o1[0].compareTo(o2[0]));
//        int row = 0;
//        for (int i = 0; i < cnt; i++) {
//            sb.append(rst[i][1]).append(" ");
//            row++;
//            if (row == 10) {
//                row = 0;
//                sb.append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A1755 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        int m = Integer.parseInt(st.nextToken());
//        int n = Integer.parseInt(st.nextToken());
//        String[][] rst = new String[n - m + 1][2];
//        int cnt = 0;
//        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
//        for (int i = m; i <= n; i++) {
//            String in = String.valueOf(i);
//            rst[cnt][0] = "";
//            for (int j = 0; j < in.length(); j++) {
//                rst[cnt][0] += arr[Integer.parseInt(in.substring(j, j + 1))];
//            }
//            rst[cnt][1] = in;
//            cnt++;
//        }
//        Arrays.sort(rst, Comparator.comparing(o -> o[0]));
//        int row = 0;
//        for (int i = 0; i < cnt; i++) {
//            sb.append(rst[i][1]).append(" ");
//            row++;
//            if (row == 10) {
//                row = 0;
//                sb.append("\n");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A1755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        String[] rst = new String[n - m + 1];
        int cnt = 0;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = m; i <= n; i++) {
            int in = i;
            rst[cnt] = "";
            while (in != 0) {
                int mod = in % 10;
                in /= 10;
                rst[cnt] = arr[mod] + rst[cnt];
            }
            hm.put(rst[cnt], i);
            cnt++;
        }
        Arrays.sort(rst);
        int row = 0;
        for (int i = 0; i < cnt; i++) {
            sb.append(hm.get(rst[i])).append(" ");
            row++;
            if (row == 10) {
                row = 0;
                sb.append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}