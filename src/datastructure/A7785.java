package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeMap<String, String> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String act = st.nextToken();
            if (act.equals("enter")) {
                map.put(name, "enter");
            }else {
                map.remove(name);
            }
        }
        Iterator<String> it = map.descendingKeySet().iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            String next = it.next();
            sb.append(next).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}
