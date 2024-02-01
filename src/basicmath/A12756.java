package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A12756 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aa = Integer.parseInt(st.nextToken());
        int ah = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int ba = Integer.parseInt(st.nextToken());
        int bh = Integer.parseInt(st.nextToken());
        int ra = (int) Math.ceil((double) bh / aa);
        int rb = (int) Math.ceil((double) ah / ba);
        if (ra < rb) {
            System.out.println("PLAYER A");
        } else if (ra > rb) {
            System.out.println("PLAYER B");
        } else {
            System.out.println("DRAW");
        }
        br.close();
    }
}
