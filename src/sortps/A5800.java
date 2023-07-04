package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

//public class A5800 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int k = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < k; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int std = Integer.parseInt(st.nextToken());
//            int[] point = new int[std];
//            for (int j = 0; j < std; j++) {
//                point[j] = Integer.parseInt(st.nextToken());
//            }
//            Arrays.sort(point);
//            sb.append("Class ").append(i + 1).append("\n");
//            int gap = 0;
//            for (int m = 0; m < std - 1; m++) {
//                gap = Math.max(gap, point[m + 1] - point[m]);
//            }
//            sb.append("Max ").append(point[std - 1]).append(", Min ").append(point[0]).append(", Largest gap ").append(gap).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            int min = 100;
            int max = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int std = Integer.parseInt(st.nextToken());
            int[] point = new int[101];
            for (int j = 0; j < std; j++) {
                int num = Integer.parseInt(st.nextToken());
                min = Math.min(min, num);
                max = Math.max(max, num);
                point[num]++;
            }
            sb.append("Class ").append(i + 1).append("\n");
            int gap = 0;
            int cnt = 0;
            for (int m = min; m <= max; m++) {
                if (point[m] > 0) {
                    gap = Math.max(gap, cnt);
                    cnt = 0;
                }
                cnt++;
            }
            sb.append("Max ").append(max).append(", Min ").append(min).append(", Largest gap ").append(gap).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}