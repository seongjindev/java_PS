package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;

//public class A14729 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        double[] arr = new double[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = Double.parseDouble(br.readLine());
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < 7; i++) {
//            System.out.printf("%.3f\n" , arr[i]);
//        }
//        br.close();
//    }
//}

//public class A14729 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        double[] arr = new double[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = Double.parseDouble(br.readLine());
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < 7; i++) {
//            sb.append(String.format("%.3f", arr[i])).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A14729 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[100001];
        for (int i = 0; i < n; i++) {
            arr[(int) (Double.parseDouble(br.readLine()) * 1000)]++;
        }
        int cnt = 0;
        for (int i = 0; i < 100001; i++) {
            if (arr[i] > 0) {
                for (int j = 0; j < arr[i]; j++) {
                    System.out.printf("%.3f\n", i / 1000.0);
                    cnt++;
                    if (cnt == 7) {
                        break;
                    }
                }
            }
            if (cnt == 7) {
                break;
            }
        }
        br.close();
    }
}


