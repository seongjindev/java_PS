package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A2721 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int tc = Integer.parseInt(br.readLine());
//        for (int i = 0; i < tc; i++) {
//            int n = Integer.parseInt(br.readLine());
//            int sum = 0;
//            for (int j = 1; j <= n; j++) {
//                sum += j * ((j + 1) * (1 + (j + 1))) / 2;
//            }
//            sb.append(sum).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A2721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        int[] arr = new int[301];
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int j = 1; j <= n; j++) {
                if (arr[j] == 0) {
                    sum += j * ((j + 1) * (1 + (j + 1))) / 2;
                }
                sum += arr[j];
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
