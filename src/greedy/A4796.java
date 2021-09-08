package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if(l+p+v==0) {
                break;
            }
            int rst = ((v/p) * l) + Math.min(v%p, l);
            sb.append("Case "+ i + ": " + rst + "\n");
            i++;
        }
        System.out.println(sb);
        br.close();
    }
}
