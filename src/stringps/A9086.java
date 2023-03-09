package stringps;

import java.io.*;

public class A9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            String t = br.readLine();
            bw.write(t.charAt(0) + "" + t.charAt(t.length()-1) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
