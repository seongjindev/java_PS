package basicmath;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//public class A5671 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String input = "";
//        while ((input = br.readLine()) != null && !input.isEmpty()) {
//            StringTokenizer st = new StringTokenizer(input);
//            int n = Integer.parseInt(st.nextToken());
//            int m = Integer.parseInt(st.nextToken());
//            int cnt = 0;
//            for (int i = n; i <= m; i++) {
//                String num = String.valueOf(i);
//                boolean chk = true;
//                loop:
//                for (int j = 0; j < num.length(); j++) {
//                    char c = num.charAt(j);
//                    for (int k = j + 1; k < num.length(); k++) {
//                        if (c == num.charAt(k)) {
//                            chk = false;
//                            break loop;
//                        }
//                    }
//                }
//                if (chk) {
//                    cnt++;
//                }
//            }
//            sb.append(cnt).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A5671 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String input = "";
//        int[] cb = new int[10];
//        while ((input = br.readLine()) != null && !input.isEmpty()) {
//            StringTokenizer st = new StringTokenizer(input);
//            int n = Integer.parseInt(st.nextToken());
//            int m = Integer.parseInt(st.nextToken());
//            int cnt = 0;
//            for (int i = n; i <= m; i++) {
//                int num = i;
//                boolean chk = true;
//                while (num != 0) {
//                    int ck = num % 10;
//                    num /= 10;
//                    if (cb[ck] > 0) {
//                        chk = false;
//                        break;
//                    }
//                    cb[ck]++;
//                }
//                if (chk) {
//                    cnt++;
//                }
//                Arrays.fill(cb, 0);
//            }
//            sb.append(cnt).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A5671 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        int[] cb = new int[10];
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            StringTokenizer st = new StringTokenizer(input);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int i = n; i <= m; i++) {
                int num = i;
                boolean chk = true;
                while (num != 0) {
                    int ck = num % 10;
                    num /= 10;
                    if (cb[ck] > 0) {
                        chk = false;
                        break;
                    }
                    cb[ck]++;
                }
                if (chk) {
                    cnt++;
                }
                Arrays.fill(cb, 0);
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
