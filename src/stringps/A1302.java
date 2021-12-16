package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class A1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> book = new HashMap<>();
        Queue<String> q = new PriorityQueue<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            String in = br.readLine();
            if (book.containsKey(in)) {
                book.put(in, book.get(in) + 1);
            } else {
                book.put(in, 1);
            }
            if (book.get(in) > max) {
                max = book.get(in);
            }
        }
        for (String s : book.keySet()) {
            if (book.get(s) == max) {
                q.offer(s);
            }
        }
        System.out.println(q.peek());
        br.close();
    }
}
