package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A24039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] s = new boolean[200];
        for (int i = 2; i < 200; i++) {
            if (!s[i]) {
                for (int j = 2; j < 200; j++) {
                    if (i*j >= 200) {
                        break;
                    }
                    s[i*j] = true;
                }
            }
        }
        int min = 0;
        Loop1 :
        for (int i = 2; i < 200; i++) {
            if (!s[i]) {
                for (int j = i+1; j < 200; j++) {
                    if (!s[j]) {
                        if (i*j > n) {
                            min = i*j;
                            break Loop1;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(min);
        br.close();
    }
}
