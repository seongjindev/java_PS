package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1855 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] arr = new String[input.length() / k];
        StringBuilder sb = new StringBuilder();
        int st = 0;
        int ed = k;
        for (int i = 0; i < input.length() / k; i++) {
            if (i % 2 == 0) {
                arr[i] = input.substring(st, ed);
            } else {
                arr[i] = new StringBuilder(input.substring(st, ed)).reverse().toString();
            }
            st += k;
            ed += k;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < input.length() / k; j++) {
                sb.append(arr[j].charAt(i));
            }
        }
        System.out.println(sb);
        br.close();
    }
}
