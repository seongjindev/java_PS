package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class A9009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(1);
        while (true) {
            if (list.getLast() > max) {
                break;
            }
            list.addLast(list.get(list.size()-1) + list.get(list.size()-2));
        }
        int s = list.size();
        for (int i = 0; i < n; i++) {
            int v = arr[i];
            int cnt = 0;
            String rst = "";
            while (true) {
                if (list.get(cnt) > v) {
                    v = v - list.get(cnt - 1);
                    rst = list.get(cnt-1)+ " " + rst;
                    cnt = 0;
                }else {
                    cnt++;
                }
                if (v == 0) {
                    break;
                }
            }
            sb.append(rst).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
