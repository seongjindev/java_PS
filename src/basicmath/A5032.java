package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A5032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());;
        int c = Integer.parseInt(st.nextToken());
        int cnt = 0;
        while (sum >= c) {
            cnt += sum / c;
            sum = sum / c + sum % c;
        }
        System.out.println(cnt);
        br.close();
    }
}
