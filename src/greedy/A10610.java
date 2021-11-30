package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int nLen = n.length();
        int[] numBox = new int[10];
        int sum = 0;
        for (int i = 0; i < nLen; i++) {
            int num = Integer.parseInt(String.valueOf(n.charAt(i)));
            numBox[num]++;
            sum += num;
        }
        if (numBox[0] == 0 || sum % 3 != 0) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 9; i >= 0; i--) {
                for (int j = 0; j < numBox[i]; j++) {
                    sb.append(i);
                }
            }
            System.out.println(sb);
        }
        br.close();
    }
}
