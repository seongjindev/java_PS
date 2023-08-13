package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int in = Integer.parseInt(st.nextToken());
            hm.put(in, hm.getOrDefault(in, 0) + 1);
        }
        List<Integer> ks = new ArrayList<>(hm.keySet());
        ks.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return hm.get(o2).compareTo(hm.get(o1));
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i : ks) {
            for (int j = 0; j < hm.get(i); j++) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}