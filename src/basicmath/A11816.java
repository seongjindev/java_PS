package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A11816 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String in = br.readLine();
//        int rst;
//        if (in.startsWith("0x")) {
//            rst = Integer.decode(in);
//        } else if (in.startsWith("0")) {
//            rst = Integer.parseInt(in, 8);
//        } else {
//            rst = Integer.parseInt(in);
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A11816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        if (in.startsWith("0x")) {
            System.out.println(Integer.decode(in));
        } else if (in.startsWith("0")) {
            System.out.println(Integer.parseInt(in, 8));
        } else {
            System.out.println(in);
        }
        br.close();
    }
}