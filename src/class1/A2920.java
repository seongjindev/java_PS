package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int as = 0;
        int de = 0;
        for (int i = 1; i < 9; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == i) {
                as++;
            }
            if (num == (9 - i)) {
                de++;
            }
        }
        if (as == 8) {
            System.out.println("ascending");
        } else if (de == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
        br.close();
    }
}
