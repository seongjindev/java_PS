package basicmath;

import java.io.*;

//public class A8741 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int k = Integer.parseInt(br.readLine());
//        bw.write("1".repeat(k));
//        bw.write("0".repeat(k - 1));
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}

public class A8741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        StringBuilder sbOne = new StringBuilder();
        StringBuilder sbZero = new StringBuilder();
        for (int i = 0; i < k - 1; i++) {
            sbOne.append("1");
            sbZero.append("0");
        }
        sbOne.append("1").append(sbZero);
        System.out.println(sbOne);
        br.close();
    }
}