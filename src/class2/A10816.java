package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A10816 {

    static int cal(int[] ca1, int key) {
        int max = ca1.length;
        int min = 0;
        int mid = 0;
        while (min < max) {
            mid = (min+max)/2;
            if(key<=ca1[mid]) {
                max = mid;
            }else {
                min = mid +1;
            }
        }
        return min;
    }

    static int cal2(int[] ca1, int key) {
        int max = ca1.length;
        int min = 0;
        int mid = 0;
        while (min < max) {
            mid = (min+max)/2;
            if(key<ca1[mid]) {
                max = mid;
            }else {
                min = mid +1;
            }
        }
        return min;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt1 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ca1 = new int[cnt1];
        for (int i = 0; i < cnt1; i++) {
            ca1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ca1);
        int cnt2 = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < cnt2; i++) {
            int n = Integer.parseInt(st2.nextToken());
            int a = cal2(ca1, n) - cal(ca1, n);
            sb.append(a + " ");
        }
        System.out.println(sb);
        br.close();
    }
}
