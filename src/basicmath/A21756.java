package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A21756 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> al = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            al.add(i);
        }
        while (al.size() > 1) {
            for (int i = 0; i < al.size(); i++) {
                al.remove(i);
            }
        }
        System.out.println(al.get(0));
        br.close();
    }
}
