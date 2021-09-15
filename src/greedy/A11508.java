package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class A11508 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        int sum = 0;
        int chk = 0;
        for (int i = 0; i < cnt; i++) {
            if (chk == 2) {
                chk=0;
                continue;
            }
            sum += arr[i];
            chk++;
        }
        System.out.println(sum);
        br.close();
    }
}
