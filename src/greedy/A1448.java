package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class A1448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] an = new Integer[n];
        for (int i = 0; i < n; i++) {
            an[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(an, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        boolean chk = false;
        int rst = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (an[i] < an[j] + an[k]) {
                        chk = true;
                        rst = an[i] + an[j] + an[k];
                        break;
                    }
                    if (an[i] >= an[j] + an[k]) {
                        break;
                    }
                }
                if (chk) {
                    break;
                }
            }
            if (chk) {
                break;
            }
        }
        if (chk) {
            System.out.println(rst);
        } else {
            System.out.println(-1);
        }
        br.close();
    }
}
