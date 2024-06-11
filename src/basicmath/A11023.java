package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

//public class A11023 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] sp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int sum = 0;
//        for (int i = 0; i < sp.length; i++) {
//            sum += sp[i];
//        }
//        System.out.println(sum);
//        br.close();
//    }
//}

//public class A11023 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int sum = 0;
//        while (st.hasMoreTokens()) {
//            sum += Integer.parseInt(st.nextToken());
//        }
//        System.out.println(sum);
//        br.close();
//    }
//}

public class A11023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");
        int sum = 0;
        for (int i = 0; i < sp.length; i++) {
            sum += Integer.parseInt(sp[i]);
        }
        System.out.println(sum);
        br.close();
    }
}