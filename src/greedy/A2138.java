package greedy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Objects;
//
//public class A2138 {
//    public static int turn(char[] be, char[] af, int n) {
//        int cnt = 0;
//        for (int i = 1; i < n; i++) {
//            if (be[i-1]!=af[i-1]) {
//                cnt++;
//                if (be[i-1]=='0') {
//                    be[i-1]= '1';
//                }else {
//                    be[i-1] = '0';
//                }
//                if (be[i] == '0') {
//                    be[i] = '1';
//                }else {
//                    be[i] = '0';
//                }
//                if (i!=n-1) {
//                    if (be[i+1]=='0') {
//                        be[i+1] = '1';
//                    }else {
//                        be[i+1] = '0';
//                    }
//                }
//            }
//        }
//        return cnt;
//    }
//    public static void main(String[] args) throws IOException {
//        //000
//        //011
//        //000
//        //010
//        //00000
//        //00100
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        char[] be0 = br.readLine().toCharArray();
//        char[] be1 = be0.clone();
//        char[] af = br.readLine().toCharArray();
//        if (be1[0]=='0') {
//            be1[0] = '1';
//        }else {
//            be1[0] = '0';
//        }
//        if (be1[1]=='0') {
//            be1[1] = '1';
//        }else {
//            be1[1] = '0';
//        }
//        int turn = turn(be0, af, n);
//        int turn1 = turn(be1, af, n) + 1;
//        if (Objects.deepEquals(be0, af)) {
//            if (Objects.deepEquals(be1, af)) {
//                if (turn < turn1) {
//                    System.out.println(turn);
//                } else {
//                    System.out.println(turn1);
//                }
//            }else {
//                System.out.println(turn);
//            }
//        }else if (Objects.deepEquals(be1, af)){
//            System.out.println(turn1);
//        } else {
//            System.out.println(-1);
//        }
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2138 {
    public static int turn(char[] be, char[] af, int n) {
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (be[i-1]!=af[i-1]) {
                cnt++;
                if (be[i-1]=='0') {
                    be[i-1]= '1';
                }else {
                    be[i-1] = '0';
                }
                if (be[i] == '0') {
                    be[i] = '1';
                }else {
                    be[i] = '0';
                }
                if (i!=n-1) {
                    if (be[i+1]=='0') {
                        be[i+1] = '1';
                    }else {
                        be[i+1] = '0';
                    }
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] be0 = br.readLine().toCharArray();
        char[] be1 = be0.clone();
        char[] af = br.readLine().toCharArray();
        if (be1[0]=='0') {
            be1[0] = '1';
        }else {
            be1[0] = '0';
        }
        if (be1[1]=='0') {
            be1[1] = '1';
        }else {
            be1[1] = '0';
        }
        int turn = turn(be0, af, n);
        int turn1 = turn(be1, af, n) + 1;
        if (be0[n-1]!=af[n-1] && be1[n-1]!=af[n-1]) {
            System.out.println(-1);
        } else if (be0[n-1]!=af[n-1]) {
            System.out.println(turn1);
        } else if (be1[n-1]!=af[n-1]) {
            System.out.println(turn);
        } else {
            System.out.println(Math.min(turn, turn1));
        }
        br.close();
    }
}

