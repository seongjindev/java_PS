package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1041 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int[] box = new int[7];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= 6; i++) {
            box[i] = Integer.parseInt(st.nextToken());
        }
        long sum = 0;
        if (n == 1) {
            Arrays.sort(box);
            sum = 0;
            for (int i = 1; i <= 5; i++) {
                sum += box[i];
            }
        }else {
            long[] num = new long[4];
            num[1] = 5 * (n-2) * (n-2) + 4 * (n-2);
            num[2] = 8 * (n-2) + 4;
            num[3] = 4;
            int minAF = Math.min(box[1], box[6]);
            int minBE = Math.min(box[2], box[5]);
            int minCD = Math.min(box[3], box[4]);
            long one = Math.min(minAF, Math.min(minBE, minCD));
            long two = Math.min(minAF+minBE, Math.min(minAF+minCD, minBE+minCD));
            long three = minAF + minBE + minCD;
            sum = 0;
            sum += num[1] * one;
            sum += num[2] * two;
            sum += num[3] * three;
        }
        System.out.println(sum);
        br.close();
    }
}

