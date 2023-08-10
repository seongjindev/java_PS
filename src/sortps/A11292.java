package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class A11292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int t = Integer.parseInt(br.readLine());
            if (t == 0) {
                break;
            }
            String[][] arr = new String[t][3];
            for (int i = 0; i < t; i++) {
                st = new StringTokenizer(br.readLine());
                arr[i][2] = st.nextToken();
                arr[i][1] = String.valueOf(i);
                arr[i][0] = st.nextToken();
            }
            Arrays.sort(arr, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    if (o1[0].equals(o2[0])) {
                        return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
                    } else {
                        return Double.compare(Double.parseDouble(o2[0]), Double.parseDouble(o1[0]));
                    }
                }
            });
            sb.append(arr[0][2]).append(" ");
            for (int i = 1; i < t; i++) {
                if (arr[i - 1][0].equals(arr[i][0])) {
                    sb.append(arr[i][2]).append(" ");
                } else {
                    break;
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}