package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        Arrays.sort(input);
        StringBuilder rst = new StringBuilder();
        for (int i = input.length-1; i >= 0; i--) {
            rst.append(input[i]);
        }
        System.out.println(rst);
        br.close();
    }
}
