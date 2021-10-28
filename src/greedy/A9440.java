package greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A9440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] arr = new String[Integer.parseInt(st.nextToken())];
            int cnt = 0;
            String a = "";
            String b = "";
            if (!st.hasMoreTokens()) {
                break;
            }
            while (st.hasMoreTokens()) {
                arr[cnt] = st.nextToken();
                cnt++;
            }
            Arrays.sort(arr);
            int zero = 0;
            for (int i = arr.length-1; i >= 0; i--) {
                if (i%2!=0) {
                    if (arr[i].equals("0")) {
                        zero++;
                    }else {
                        a = arr[i] + a;
                    }
                }else {
                    if (arr[i].equals("0")) {
                        zero++;
                    }else {
                        b = arr[i] + b;
                    }
                }
            }
            for (int j = 0; j < zero; j++) {
                int aa = Integer.parseInt(a);
                int bb = Integer.parseInt(b);
                if (aa > bb) {
                    b = b.substring(0,1) + "0" + b.substring(1);
                }else {
                    a = a.substring(0,1) + "0" + a.substring(1);
                }
            }
            int rst = Integer.parseInt(a) + Integer.parseInt(b);
            sb.append(rst).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}

