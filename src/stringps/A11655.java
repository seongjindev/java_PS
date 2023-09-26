package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 65 && c <= 90) {
                sb.append((char)((c - 'A' + 13) % 26 + 'A'));
            } else if (c >= 97 && c <= 122) {
                sb.append((char)((c - 'a' + 13) % 26 + 'a'));
            } else {
                sb.append(input.charAt(i));
            }
        }
        System.out.println(sb);
        br.close();
    }
}
