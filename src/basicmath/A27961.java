package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A27961 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        long input = Long.parseLong(br.readLine());
//        int cnt = 0;
//        while (input > 3) {
//            if (input % 2 == 1) {
//                input /= 2;
//                input++;
//            } else {
//                input /= 2;
//            }
//            cnt++;
//        }
//        System.out.println(cnt + input);
//        br.close();
//    }
//}

public class A27961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long input = Long.parseLong(br.readLine());
        int cnt = 1;
        long cat = 1;
        while (cat < input) {
            cat *= 2;
            cnt++;
        }
        System.out.println(input == 0 ? 0 : cnt);
        br.close();
    }
}
