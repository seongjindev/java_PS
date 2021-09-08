package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String st = br.readLine();
        st = st.replace("LL", "S");
        int tot = 1;
        for(int i = 0; i < st.length(); i++) {
            if(st.charAt(i)=='S') {
                tot++;
            }
        }
        int rst = Math.min(cnt, tot);
        System.out.println(rst);
        br.close();
    }
}
