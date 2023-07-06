package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][4];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int na = Integer.parseInt(st.nextToken());
            arr[i][3] = na;
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                if (o1[1] == o2[1]) {
                    return o2[2] - o1[2];
                } else {
                    return o2[1] - o1[1];
                }
            } else {
                return o2[0] - o1[0];
            }
        });
        int rank = 0;
        int du = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i - 1][0] == arr[i][0] && arr[i - 1][1] == arr[i][1] && arr[i - 1][2] == arr[i][2]) {
                du++;
            } else {
                rank += du;
                du = 1;
            }
            if (arr[i][3] == k) {
                System.out.println(rank);
                break;
            }
        }
        br.close();
    }
}