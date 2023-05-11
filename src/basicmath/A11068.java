package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A11068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int in = Integer.parseInt(br.readLine());
            int rst = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 2; j <= 64; j++) {
                int chk = 1;
                int num = in;
                while (num != 0) {
                    arr.add(num % j);
                    num /= j;
                }
                for (int k = 0; k <= arr.size() / 2; k++) {
                    if (!arr.get(k).equals(arr.get(arr.size() - 1 - k))) {
                        chk = 0;
                        break;
                    }
                }
                if (chk == 1) {
                    rst = 1;
                    break;
                }
                arr.clear();
            }
            System.out.println(rst);
        }
        br.close();
    }
}
