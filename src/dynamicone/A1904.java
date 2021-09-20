package dynamicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] box = new int[num+2];
        box[0] = 0;
        box[1] = 1;
        box[2] = 2;
        if (num > 2) {
            for (int i = 3; i <= num; i++) {
                box[i] = (box[i - 1] + box[i - 2]) % 15746;
            }
        }
        System.out.println(box[num]);
    }
}
