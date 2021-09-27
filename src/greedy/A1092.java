package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] crane = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            crane[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(crane, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int m = Integer.parseInt(br.readLine());
        List<Integer> box = new ArrayList<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            box.add(Integer.parseInt(st2.nextToken()));
        }
        Collections.sort(box, Collections.reverseOrder());
        int sum = 0;
        if (box.get(0) > crane[0]) {
            sum = -1;
        }else {
            while (box.size()!=0) {
                int idx = 0;
                for (int i = 0; i < n;) {
                    if(idx == box.size()) break;
                    else if(crane[i] >= box.get(idx)) {
                        box.remove(idx);
                        i++;
                    }
                    else idx++;
                }
               sum++;
            }
        }
        System.out.println(sum);
        br.close();
    }
}
