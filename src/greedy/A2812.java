package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class A2812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char[] chars = br.readLine().toCharArray();
        Deque<Character> de = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (k > 0 && !de.isEmpty() &&de.getLast() < chars[i]) {
                de.removeLast();
                k--;
            }
            de.addLast(chars[i]);
        }
        StringBuilder sb = new StringBuilder();
        int s = de.size();
        for (int i = 0; i < s-k; i++) {
            sb.append(de.removeFirst());

        }
        System.out.println(sb);
        br.close();
    }
}
