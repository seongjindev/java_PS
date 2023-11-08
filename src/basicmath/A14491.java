package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A14491 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        while (t != 0) {
//            sb.insert(0, t % 9);
//            t = t / 9;
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A14491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.toString(Integer.parseInt(br.readLine()), 9));
        br.close();
    }
}
