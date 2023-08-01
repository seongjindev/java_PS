package prefixsumps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A11059 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] split = br.readLine().split("");
//        int[] in = new int[split.length + 1];
//        for (int i = 1; i < in.length; i++) {
//            in[i] = in[i - 1] + Integer.parseInt(split[i - 1]);
//        }
//        int mLen = 0;
//        for (int i = 1; i < in.length; i++) {
//            int idx = i;
//            for (int j = i + 1; j < in.length; j += 2) {
//                int half = in[idx] - in[i - 1];
//                if (half == in[j] - in[idx]) {
//                    if (j - i + 1 >= mLen) {
//                        mLen = j - i + 1;
//                    }
//                }
//                idx += 1;
//            }
//        }
//        System.out.println(mLen);
//        br.close();
//    }
//}

//public class A11059 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] split = br.readLine().split("");
//        int[] in = new int[split.length + 1];
//        for (int i = 1; i < in.length; i++) {
//            in[i] = in[i - 1] + Integer.parseInt(split[i - 1]);
//        }
//        int mLen = 0;
//        for (int i = 1; i < in.length; i++) {
//            int idx = i;
//            for (int j = i + 1; j < in.length; j += 2) {
//                if (in[idx] - in[i - 1] == in[j] - in[idx]) {
//                    if (j - i + 1 >= mLen) {
//                        mLen = j - i + 1;
//                    }
//                }
//                idx += 1;
//            }
//        }
//        System.out.println(mLen);
//        br.close();
//    }
//}

//public class A11059 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] split = br.readLine().split("");
//        int[] in = new int[split.length + 1];
//        for (int i = 1; i < in.length; i++) {
//            in[i] = in[i - 1] + Integer.parseInt(split[i - 1]);
//        }
//        int max = split.length / 2;
//        if (split.length % 2 == 1) {
//            max = (split.length - 1) / 2;
//        }
//        int mLen = 0;
//        for (int i = max; i > 0; i--) {
//            for (int j = 0; j < in.length; j++) {
//                int idx = i + j;
//                if (j + i + i < in.length) {
//                    if (in[idx] - in[j] == in[idx + i] - in[idx]) {
//                        mLen = i * 2;
//                        break;
//                    }
//                }
//            }
//            if (mLen > 0) {
//                break;
//            }
//        }
//        System.out.println(mLen);
//        br.close();
//    }
//}

//public class A11059 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] split = br.readLine().split("");
//        int[] in = new int[split.length + 1];
//        for (int i = 1; i < in.length; i++) {
//            in[i] = in[i - 1] + Integer.parseInt(split[i - 1]);
//        }
//        int max = split.length / 2;
//        if (split.length % 2 == 1) {
//            max = (split.length - 1) / 2;
//        }
//        int mLen = 0;
//        for (int i = max; i > 0; i--) {
//            for (int j = 0; j < in.length; j++) {
//                int idx = i + j;
//                if (idx + i < in.length) {
//                    if (in[idx] - in[j] == in[idx + i] - in[idx]) {
//                        mLen = i * 2;
//                        break;
//                    }
//                } else {
//                    break;
//                }
//            }
//            if (mLen > 0) {
//                break;
//            }
//        }
//        System.out.println(mLen);
//        br.close();
//    }
//}

//public class A11059 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] sp = br.readLine().split("");
//        int sl = sp.length;
//        int[] in = new int[sl + 1];
//        for (int i = 1; i < in.length; i++) {
//            in[i] = in[i - 1] + Integer.parseInt(sp[i - 1]);
//        }
//
//        int max = sl / 2;
//        if (sl % 2 == 1) {
//            max = (sl - 1) / 2;
//        }
//        boolean chk = true;
//        while (chk) {
//            for (int j = 0; j < in.length; j++) {
//                int idx = max + j;
//                if (idx + max < in.length) {
//                    if (in[idx] - in[j] == in[idx + max] - in[idx]) {
//                        chk = false;
//                        break;
//                    }
//                } else {
//                    max--;
//                    break;
//                }
//            }
//        }
//        System.out.println(max * 2);
//        br.close();
//    }
//}

public class A11059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("");
        int[] in = new int[split.length + 1];
        for (int i = 1; i < in.length; i++) {
            in[i] = in[i - 1] + Integer.parseInt(split[i - 1]);
        }
        int mLen = 0;
        for (int i = 1; i < in.length; i++) {
            int idx = i;
            for (int j = i + 1; j < in.length; j += 2) {
                if (in[idx] - in[i - 1] == in[j] - in[idx]) {
                    mLen = Math.max(mLen, j - i + 1);
                }
                idx += 1;
            }
        }
        System.out.println(mLen);
        br.close();
    }
}