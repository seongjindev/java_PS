package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cap = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            cap[i] = Integer.parseInt(br.readLine());
            sum += cap[i];
        }
        StringBuilder sb = new StringBuilder();
        loop:
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (cap[i] + cap[j]) == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            sb.append(cap[k]).append("\n");
                        }
                    }
                    break loop;
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}
