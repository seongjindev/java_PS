package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//public class A11899 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char[] ch = br.readLine().toCharArray();
//        int lt = 0;
//        int rt = 0;
//        for (char c : ch) {
//            if (c == ')') {
//                if (rt <= 0) {
//                    lt++;
//                } else {
//                    rt--;
//                }
//            } else {
//                rt++;
//            }
//        }
//        System.out.println(lt + rt);
//        br.close();
//    }
//}

//public class A11899 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Stack<String> st = new Stack<>();
//        String in = br.readLine();
//        for (int i = 0; i < in.length(); i++) {
//            String ss = in.substring(i, i + 1);
//            if (!st.isEmpty()) {
//                if (ss.equals(")")) {
//                    if (st.peek().equals(ss)) {
//                        st.push(ss);
//                    } else {
//                        st.pop();
//                    }
//                } else {
//                    st.push(ss);
//                }
//            } else {
//                st.push(ss);
//            }
//        }
//        System.out.println(st.size());
//        br.close();
//    }
//}

public class A11899 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> st = new Stack<>();
        String in = br.readLine();
        for (int i = 0; i < in.length(); i++) {
            String ss = in.substring(i, i + 1);
            if (!st.isEmpty() && ss.equals(")")) {
                if (st.peek().equals(ss)) {
                    st.push(ss);
                } else {
                    st.pop();
                }
            } else {
                st.push(ss);
            }
        }
        System.out.println(st.size());
        br.close();
    }
}