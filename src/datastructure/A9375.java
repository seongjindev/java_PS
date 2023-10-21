package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> hm = new HashMap<>();
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String cloth = st.nextToken();
                hm.put(cloth, hm.getOrDefault(cloth, 1) + 1);
            }
            int rst = 1;
            for (String key : hm.keySet()) {
                rst *= hm.get(key);
            }
            sb.append(rst - 1).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
