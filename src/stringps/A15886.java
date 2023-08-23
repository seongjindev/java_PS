package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A15886 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        char[] ch = br.readLine().toCharArray();
//        boolean chk = false;
//        int cnt = 0;
//        for (int i = 0; i < n; i++) {
//            if (ch[i] == 'W' && chk) {
//                cnt++;
//                chk = false;
//            } else if (ch[i] == 'E') {
//                chk = true;
//            }
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

//public class A15886 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String in = br.readLine();
//        int cnt = 0;
//        for (int i = 0; i < n - 1; i++) {
//            if (in.startsWith("EW", i)) cnt++;
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

public class A15886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String in = br.readLine();
        int cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            if (in.substring(i, i + 2).equals("EW")) cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}

