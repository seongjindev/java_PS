package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A9417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<Long> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long max = 0;
            while (st.hasMoreTokens()) {
                arr.add(Long.parseLong(st.nextToken()));
            }
            for (int j = 0; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    long l = gcd(arr.get(j), arr.get(k));
                    if (l > max) {
                        max = l;
                    }
                }
            }
            arr.clear();
            sb.append(max).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
