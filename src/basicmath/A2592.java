package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class A2592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int in = Integer.parseInt(br.readLine());
            sum += in;
            map.merge(in, 1, Integer::sum);
        }
        int cnt = 0;
        int mode = 0;
        for (int i : map.keySet()) {
            if (map.get(i) > cnt) {
                cnt = map.get(i);
                mode = i;
            }
        }
        System.out.println(sum/10 + "\n" + mode);
        br.close();
    }
}
