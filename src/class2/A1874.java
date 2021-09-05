package class2;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Stack;
//
//public class A1874 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//        int[] arr = new int[cnt];
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < cnt; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        Stack<Integer> st = new Stack<>();
//        int in = 1;
//        st.push(in);
//        sb.append("+\n");
//        for(int i = 0; i<cnt; i++) {
//            while(in<=cnt) {
//                if(st.size()==0) {
//                    in++;
//                    st.push(in);
//                    sb.append("+\n");
//                }
//                if(st.peek()==arr[i]){
//                    st.pop();
//                    sb.append("-\n");
//                    break;
//                }
//                in++;
//                st.push(in);
//                sb.append("+\n");
//            }
//        }
//        if(st.size()==0) {
//            System.out.println(sb);
//        }else {
//            System.out.println("NO");
//        }
//        br.close();
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class A1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        Integer[] arr2 = new Integer[cnt];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cnt; i++) {
            int a = Integer.parseInt(br.readLine());
            arr.add(a);
            arr2[i] = a;
        }
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for(int i = 0; i < cnt; i++) {
            while(num<=cnt+1) {
                if(st.size()!=0) {
                    if (st.peek().equals(arr2[i])) {
                        sb.append("-\n");
                        st.pop();
                        break;
                    }else {
                        st.push(num);
                        sb.append("+\n");
                        num++;
                    }
                }else {
                    st.push(num);
                    sb.append("+\n");
                    num++;
                }
            }
        }
        if(st.size()==0) {
            System.out.println(sb);
        }else{
            System.out.println("NO");
        }
        br.close();
    }
}