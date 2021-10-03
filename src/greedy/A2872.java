package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A2872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.reverse(arr);
        int rst = 0;
        int max = n;
        for (int i = 0; i < n; i++) {
            if (arr.get(i)==max) {
                max--;
            }else {
                rst++;
            }
        }
        System.out.println(rst);
        br.close();
    }
}
