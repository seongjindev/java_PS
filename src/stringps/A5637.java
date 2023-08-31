package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A5637 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        boolean ck = false;
//        int max = 0;
//        String s = "";
//        while (!ck) {
//            StringTokenizer st = new StringTokenizer(br.readLine().replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9- ]", ""));
//            while (st.hasMoreTokens()) {
//                String in = st.nextToken();
//                if (in.equals("E-N-D")) {
//                    ck = true;
//                    break;
//                }
//                if (in.length() > max) {
//                    max = in.length();
//                    s = in;
//                }
//            }
//        }
//        System.out.println(s.toLowerCase());
//        br.close();
//    }
//}

//public class A5637 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        boolean ck = false;
//        String s = "";
//        while (!ck) {
//            StringTokenizer st = new StringTokenizer(br.readLine().replaceAll("[^a-zA-Z\\-\\s]", ""));
//            while (st.hasMoreTokens()) {
//                String in = st.nextToken();
//                if (in.equals("E-N-D")) {
//                    ck = true;
//                    break;
//                }
//                if (in.length() > s.length()) {
//                    s = in;
//                }
//            }
//        }
//        System.out.println(s.toLowerCase());
//        br.close();
//    }
//}

//public class A5637 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        boolean ck = false;
//        String rst = "";
//        while (!ck) {
//            String[] sp = br.readLine().toLowerCase().split("[^a-z-]");
//            for (String s : sp) {
//                if (s.equals("e-n-d")) {
//                    ck = true;
//                    break;
//                }
//                if (s.length() > rst.length()) {
//                    rst = s;
//                }
//            }
//        }
//        System.out.println(rst.toLowerCase());
//        br.close();
//    }
//}

//public class A5637 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        boolean ck = false;
//        String rst = "";
//        while (!ck) {
//            String[] sp = br.readLine().toLowerCase().split("[^a-z-]");
//            for (String s : sp) {
//                if (s.equals("e-n-d")) {
//                    ck = true;
//                    break;
//                }
//                if (s.length() > rst.length()) {
//                    rst = s;
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A5637 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean ck = false;
        String rst = "";
        while (!ck) {
            String[] sp = br.readLine().split("[^a-zA-Z-]");
            for (String s : sp) {
                if (s.equals("E-N-D")) {
                    ck = true;
                    break;
                }
                if (s.length() > rst.length()) {
                    rst = s;
                }
            }
        }
        System.out.println(rst.toLowerCase());
        br.close();
    }
}
