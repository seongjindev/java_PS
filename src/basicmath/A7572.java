package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A7572 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int t = ((n % 10) + 6) % 10;
//        char tw = (char) ((((n % 12) + 8) % 12) + 65);
//        System.out.println(tw + "" + t);
//        br.close();
//    }
//}

//public class A7572 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine()) + 56;
//        int t = n % 10;
//        char tw = (char) (n % 12 + 65);
//        System.out.println(tw + "" + t);
//        br.close();
//    }
//}

public class A7572 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = {6, 7, 8, 9, 0, 1, 2, 3, 4, 5};
        String[] tw = {"I", "J", "K", "L", "A", "B", "C", "D", "E", "F", "G", "H"};
        System.out.println(tw[n % 12] + "" + t[n % 10]);
        br.close();
    }
}
