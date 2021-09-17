package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A3135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int min = Math.min(Math.abs(a-b), 1000);
        for (int i = 0; i < n; i++) {
            int ju = Integer.parseInt(br.readLine());
            min = Math.min(min, 1+Math.abs((ju-b)));
        }
        System.out.println(min);
        br.close();
    }
}
