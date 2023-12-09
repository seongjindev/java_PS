package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A16462 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine().replace("0", "9").replace("6", "9");
            int num = Math.min(100, Integer.parseInt(s));
            sum += num;
        }
        System.out.println((int) Math.round((double) sum / n));
        br.close();
    }
}