package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A2484 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[4];
            int diceMax = 0;
            int won;
            for (int j = 0; j < 4; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                diceMax = Math.max(diceMax, arr[j]);
            }
            Arrays.sort(arr);
            if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
                won = 50000 + arr[0] * 5000;
            } else if ((arr[0] == arr[1] && arr[1] == arr[2]) || (arr[1] == arr[2] && arr[2] == arr[3])) {
                won = 10000 + arr[1] * 1000;
            } else if (arr[0] == arr[1] && arr[2] == arr[3]) {
                won = 2000 + arr[0] * 500 + arr[2] * 500;
            } else if (arr[0] == arr[1]) {
                won = 1000 + arr[0] * 100;
            } else if (arr[1] == arr[2]) {
                won = 1000 + arr[1] * 100;
            } else if (arr[2] == arr[3]) {
                won = 1000 + arr[2] * 100;
            } else {
                won = diceMax * 100;
            }
            max = Math.max(max, won);
        }
        System.out.println(max);
        br.close();
    }
}