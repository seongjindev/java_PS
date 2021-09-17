package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A19941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char[] chars = br.readLine().toCharArray();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i]=='P') {
                for (int j = i-k; j<=i+k; j++) {
                    if (j < 0 || j >= n) {
                        continue;
                    }else {
                        if (chars[j] == 'H') {
                            chars[j] = 'X';
                            sum++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
        br.close();
    }
}
