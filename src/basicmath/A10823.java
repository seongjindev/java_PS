package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A10823 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String input = "";
//        int sum = 0;
//        while ((input = br.readLine()) != null && !input.isEmpty()) {
//            sb.append(input);
//        }
//        StringTokenizer st = new StringTokenizer(sb.toString(), ",");
//        while (st.hasMoreTokens()) {
//            sum += Integer.parseInt(st.nextToken());
//        }
//        System.out.println(sum);
//        br.close();
//    }
//}

public class A10823 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        int sum = 0;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            sb.append(input);
        }
        String[] sp = sb.toString().split(",");
        for (int i = 0; i < sp.length; i++) {
            sum += Integer.parseInt(sp[i]);
        }
        System.out.println(sum);
        br.close();
    }
}
