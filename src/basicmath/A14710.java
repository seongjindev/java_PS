package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A14710 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int h = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        if ((h % 30) * 12 == m) {
//            System.out.println("O");
//        } else {
//            System.out.println("X");
//        }
//        br.close();
//    }
//}

public class A14710 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String rst = "O";
        if ((h % 30) * 12 != m) {
            rst = "X";
        }
        System.out.println(rst);
        br.close();
    }
}