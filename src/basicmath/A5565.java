package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A5565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        for (int i = 0; i < 9; i++) {
            p -= Integer.parseInt(br.readLine());
        }
        System.out.println(p);
        br.close();
    }
}
