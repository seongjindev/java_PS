package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A15312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int siz = a.length();
        int num = 0;
        int[] ab = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        int[][] arr = new int[siz+siz-1][siz+siz];
        for (int i = 0; i < siz+siz; i++) {
            if (i % 2 == 0) {
                arr[0][i] = ab[a.charAt(num) - 'A'];
            } else {
                arr[0][i] = ab[b.charAt(num) - 'A'];
                num++;
            }
        }
        for (int i = 1; i < siz+siz-1; i++) {
            for (int j = 0; j < siz+siz-1; j++) {
                arr[i][j] = (arr[i-1][j] + arr[i-1][j+1]) % 10;
            }
        }
        System.out.println(arr[siz+siz-2][0] + "" + arr[siz+siz-2][1]);
        br.close();
    }
}
