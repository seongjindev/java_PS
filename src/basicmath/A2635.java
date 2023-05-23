package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//public class A2635 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int max = 0;
//        String rst = "";
//        for (int i = n; i >= 1; i--) {
//            StringBuilder sb = new StringBuilder();
//            sb.append(n).append(" ");
//            int snd = i;
//            int fir = n;
//            sb.append(snd).append(" ");
//            int cnt = 2;
//            while (true) {
//                int nxt = fir - snd;
//                if (nxt < 0) {
//                    break;
//                }
//                sb.append(nxt).append(" ");
//                cnt++;
//                fir = snd;
//                snd = nxt;
//            }
//            if (cnt > max) {
//                max = cnt;
//                rst = String.valueOf(sb);
//            }
//        }
//        System.out.println(max + "\n" + rst);
//        br.close();
//    }
//}

//public class A2635 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<Integer> arr = new ArrayList<>();
//        ArrayList<Integer> rst = new ArrayList<>();
//        int max = 0;
//        for (int i = n; i >= 1; i--) {
//            arr.add(n);
//            int snd = i;
//            int fir = n;
//            arr.add(snd);
//            int cnt = 2;
//            while (true) {
//                int nxt = fir - snd;
//                if (nxt < 0) {
//                    break;
//                }
//                arr.add(nxt);
//                cnt++;
//                fir = snd;
//                snd = nxt;
//            }
//            if (cnt > max) {
//                max = cnt;
//                rst = new ArrayList<>(arr);
//            }
//            arr.clear();
//        }
//        System.out.println(max);
//        rst.forEach(i -> System.out.print(i + " "));
//        br.close();
//    }
//}

//public class A2635 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int max = 0;
//        StringBuilder rst = new StringBuilder();
//        StringBuilder sb = new StringBuilder();
//        for (int i = n; i >= 1; i--) {
//            sb.append(n).append(" ");
//            int snd = i;
//            int fir = n;
//            sb.append(snd).append(" ");
//            int cnt = 2;
//            while (true) {
//                int nxt = fir - snd;
//                if (nxt < 0) {
//                    break;
//                }
//                sb.append(nxt).append(" ");
//                cnt++;
//                fir = snd;
//                snd = nxt;
//            }
//            if (cnt > max) {
//                max = cnt;
//                rst = new StringBuilder(sb);
//            }
//            sb.delete(0, sb.length());
//        }
//        System.out.println(max + "\n" + rst);
//        br.close();
//    }
//}

public class A2635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        StringBuilder rst = new StringBuilder();
        for (int i = n; i >= n/2; i--) {
            StringBuilder sb = new StringBuilder();
            int snd = i;
            int fir = n;
            sb.append(n).append(" ").append(snd).append(" ");
            int cnt = 2;
            while (true) {
                int nxt = fir - snd;
                if (nxt < 0) {
                    break;
                }
                sb.append(nxt).append(" ");
                cnt++;
                fir = snd;
                snd = nxt;
            }
            if (cnt > max) {
                max = cnt;
                rst = sb;
            }
        }
        System.out.println(max + "\n" + rst);
        br.close();
    }
}