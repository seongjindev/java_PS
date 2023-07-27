package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class A11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < in.length(); i++) {
            for (int j = i + 1; j <= in.length(); j++) {
                hs.add(in.substring(i, j));
            }
        }
        System.out.println(hs.size());
        br.close();
    }
}
