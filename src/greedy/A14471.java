package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class A14471 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        for(int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            if(a>=b) {
                cnt++;
            }else {
                list.add(n-a);
            }
        }
        if(cnt>=m-1) {
            System.out.println(0);
        }else {
            Collections.sort(list);
            int sum = 0;
            for(int i = 0; i<m-cnt-1; i++) {
                sum += list.get(i);
            }
            System.out.println(sum);
        }
        br.close();
    }
}
