package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int[] team = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < s; i++) {
            team[Integer.parseInt(st.nextToken())] = -1;
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < r; i++) {
            team[Integer.parseInt(st.nextToken())]++;
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (team[i] == -1) {
                if (i-1 > 0) {
                    if (team[i - 1] == 1) {
                        team[i - 1] = 0;
                        team[i] = 0;
                        continue;
                    }
                }
                if (i+1 <= n) {
                    if (team[i + 1] == 1) {
                        team[i + 1] = 0;
                        team[i] = 0;
                        continue;
                    }
                }
                if (team[i] == -1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
