package inputps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        System.out.println(input - 543);
        br.close();
    }
}
