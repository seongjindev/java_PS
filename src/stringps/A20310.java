package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A20310 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        List<String> lt = new ArrayList<>();
        int zero = 0;
        int one = 0;
        for (int i = 0; i < in.length(); i++) {
            String ss = in.substring(i, i + 1);
            if (ss.equals("0")) {
                zero++;
            } else {
                one++;
            }
            lt.add(ss);
        }
        zero /= 2;
        one /= 2;
        int idx = 0;
        while (one != 0) {
            if (lt.get(idx).equals("1")) {
                lt.remove(idx);
                one--;
            } else {
                idx++;
            }
        }
        idx = lt.size() - 1;
        while (zero != 0) {
            if (lt.get(idx).equals("0")) {
                lt.remove(idx);
                zero--;
            }
            idx--;
        }
        StringBuilder sb = new StringBuilder();
        for (String s : lt) {
            sb.append(s);
        }
        System.out.println(sb);
        br.close();
    }
}
