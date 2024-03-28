package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A10886 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            if (br.readLine().equals("1")) {
//                sum++;
//            } else {
//                sum--;
//            }
//        }
//        if (sum > 0) {
//            System.out.println("Junhee is cute!");
//        } else {
//            System.out.println("Junhee is not cute!");
//        }
//        br.close();
//    }
//}

public class A10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String rst = "Junhee is cute!";
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (br.readLine().equals("1")) sum++;
            else sum--;
        }
        if (sum < 0) {
            rst = "Junhee is not cute!";
        }
        System.out.println(rst);
        br.close();
    }
}
