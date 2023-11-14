package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1731 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        if (arr[2] - arr[1] == arr[1] - arr[0]) {
            System.out.println(arr[1] - arr[0] + arr[n - 1]);
        } else {
            System.out.println(arr[1] / arr[0] * arr[n - 1]);
        }
        br.close();
    }
}
