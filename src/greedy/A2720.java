package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        int[] cash = {25, 10, 5, 1};
        int cnt = 0;
        for (int i = 0; i < tc; i++) {
            int money = Integer.parseInt(br.readLine());
            for (int j = 0; j < 4; j++) {
                cnt = 0;
                if (money >= cash[j]) {
                    cnt = money/cash[j];
                    money %= cash[j];
                }
                sb.append(cnt + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
