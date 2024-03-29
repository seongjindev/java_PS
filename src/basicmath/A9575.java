package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class A9575 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//        for (int i = 0; i < t; i++) {
//            int a = Integer.parseInt(br.readLine());
//            st = new StringTokenizer(br.readLine());
//            Set<Integer> aSet = new HashSet<>();
//            for (int aa = 0; aa < a; aa++) {
//                aSet.add(Integer.parseInt(st.nextToken()));
//            }
//            List<Integer> aList = new ArrayList<>(aSet);
//            int b = Integer.parseInt(br.readLine());
//            st = new StringTokenizer(br.readLine());
//            Set<Integer> bSet = new HashSet<>();
//            for (int bb = 0; bb < b; bb++) {
//                bSet.add(Integer.parseInt(st.nextToken()));
//            }
//            List<Integer> bList = new ArrayList<>(bSet);
//            int c = Integer.parseInt(br.readLine());
//            st = new StringTokenizer(br.readLine());
//            Set<Integer> cSet = new HashSet<>();
//            for (int cc = 0; cc < c; cc++) {
//                cSet.add(Integer.parseInt(st.nextToken()));
//            }
//            List<Integer> cList = new ArrayList<>(cSet);
//            Set<Integer> rSet = new HashSet<>();
//            for (int x = 0; x < aSet.size(); x++) {
//                for (int y = 0; y < bSet.size(); y++) {
//                    for (int z = 0; z < cSet.size(); z++) {
//                        int sum = aList.get(x) + bList.get(y) + cList.get(z);
//                        int r = sum;
//                        boolean chk = true;
//                        while (sum != 0) {
//                            int mod = sum % 10;
//                            if (mod != 5 && mod != 8) {
//                                chk = false;
//                                break;
//                            }
//                            sum /= 10;
//                        }
//                        if (chk) {
//                            rSet.add(r);
//                        }
//                    }
//                }
//            }
//            sb.append(rSet.size()).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A9575 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//        for (int i = 0; i < t; i++) {
//            int a = Integer.parseInt(br.readLine());
//            st = new StringTokenizer(br.readLine());
//            List<Integer> aList = new ArrayList<>(sa(a, st));
//            int b = Integer.parseInt(br.readLine());
//            st = new StringTokenizer(br.readLine());
//            List<Integer> bList = new ArrayList<>(sa(b, st));
//            int c = Integer.parseInt(br.readLine());
//            st = new StringTokenizer(br.readLine());
//            List<Integer> cList = new ArrayList<>(sa(c, st));
//            Set<Integer> rSet = new HashSet<>();
//            for (int x = 0; x < aList.size(); x++) {
//                for (int y = 0; y < bList.size(); y++) {
//                    for (int z = 0; z < cList.size(); z++) {
//                        int sum = aList.get(x) + bList.get(y) + cList.get(z);
//                        int r = sum;
//                        boolean chk = true;
//                        while (sum != 0) {
//                            int mod = sum % 10;
//                            if (mod != 5 && mod != 8) {
//                                chk = false;
//                                break;
//                            }
//                            sum /= 10;
//                        }
//                        if (chk) {
//                            rSet.add(r);
//                        }
//                    }
//                }
//            }
//            sb.append(rSet.size()).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//    static Set<Integer> sa(int n, StringTokenizer st) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            set.add(Integer.parseInt(st.nextToken()));
//        }
//        return set;
//    }
//}

public class A9575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            List<Integer> aList = new ArrayList<>(sa(Integer.parseInt(br.readLine()), br.readLine()));
            List<Integer> bList = new ArrayList<>(sa(Integer.parseInt(br.readLine()), br.readLine()));
            List<Integer> cList = new ArrayList<>(sa(Integer.parseInt(br.readLine()), br.readLine()));
            Set<Integer> rSet = new HashSet<>();
            for (int x = 0; x < aList.size(); x++) {
                for (int y = 0; y < bList.size(); y++) {
                    for (int z = 0; z < cList.size(); z++) {
                        int sum = aList.get(x) + bList.get(y) + cList.get(z);
                        int r = sum;
                        boolean chk = true;
                        while (sum != 0) {
                            int mod = sum % 10;
                            if (mod != 5 && mod != 8) {
                                chk = false;
                                break;
                            }
                            sum /= 10;
                        }
                        if (chk) {
                            rSet.add(r);
                        }
                    }
                }
            }
            sb.append(rSet.size()).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    static Set<Integer> sa(int n, String str) {
        Set<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(str);
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        return set;
    }
}