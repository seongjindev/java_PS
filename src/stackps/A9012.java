package stackps;

import java.util.Scanner;
import java.util.Stack;

//public class A9012 {
//    public static void main(String[] args) {
//        //스택을 사용하지 않더라도 풀 수 있는 문제
//        Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//        for(int i=0; i<cnt; i++) {
//            String in = sc.next();
//            Stack<String> ps = new Stack<>();
//            for(int j=0; j<in.length(); j++) {
//                char c = in.charAt(j);
//                if(c=='(') {
//                    ps.add("(");
//                }else if(c==')') {
//                    if(ps.size()==0){
//                        System.out.println("NO");
//                        break;
//                    }else{
//                        ps.pop();
//                    }
//                }
//                if(j==in.length()-1 && ps.size()==0){
//                    System.out.println("YES");
//                }else if(j==in.length()-1){
//                    System.out.println("NO");
//                }
//            }
//        }
//        sc.close();
//    }
//}

public class A9012 {
    public static void main(String[] args) {
        //스택을 사용하지 않더라도 풀 수 있는 문제
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            String in = sc.next();
            int rst = 0;
            for (int j = 0; j < in.length(); j++) {
                char c = in.charAt(j);
                if(c == '(') {
                    rst++;
                }else{
                    if(rst == 0){
                        rst--;
                        break;
                    }else{
                        rst--;
                    }
                }
            }
            if(rst==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
