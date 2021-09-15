package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class A2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Integer[] k = new Integer[cnt];
        for (int i = 0; i < cnt; i++) {
            k[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        int max = k[0];
        int min = k[0];
        for (int i = 1; i < cnt; i++) {
            min = Math.min(min, k[i]);
            if (max < min*(i+1)) {
                max = min*(i+1);
            }
        }
        System.out.println(max);
        br.close();
    }
}
