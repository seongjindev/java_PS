package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int car = Integer.parseInt(br.readLine());
            int option = Integer.parseInt(br.readLine());
            for (int j = 0; j < option; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                car += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            }
            sb.append(car).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
