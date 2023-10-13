package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A26517 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long k = Long.parseLong(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = (Long.parseLong(st.nextToken()) * k) + Long.parseLong(st.nextToken());
        long c = (Long.parseLong(st.nextToken()) * k) + Long.parseLong(st.nextToken());;
        if (a == c) {
            System.out.println("Yes " + a);
        } else {
            System.out.println("No");
        }
        br.close();
    }
}
