package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        String[] arr = new String[in.length()];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < in.length(); i++) {
            arr[i] = in.substring(i);
        }
        Arrays.sort(arr);
        for (int i = 0; i < in.length(); i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
