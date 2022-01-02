package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[5];
        int max = 0;
        for (int i = 0; i < 5; i++) {
            input[i] = br.readLine();
            max = Math.max(max, input[i].length());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (input[j].length() > i) {
                    sb.append(input[j].charAt(i));
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}
