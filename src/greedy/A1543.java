package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int i = 0;
        while(a.indexOf(b)!=-1) {
            a = a.substring(a.indexOf(b)+b.length());
            i++;
        }
        System.out.println(i);
        br.close();
    }
}
