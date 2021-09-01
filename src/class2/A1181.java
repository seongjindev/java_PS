package class2;

import java.io.*;
import java.util.*;

public class A1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        HashSet<String> in = new HashSet<>();
        for (int i = 0; i < cnt; i++) {
            in.add(br.readLine());
        }
        List<String> collect = new ArrayList<>(in);
        collect.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        for (String s : collect) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
