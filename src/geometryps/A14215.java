package geometryps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] tri = new int[3];
        st = new StringTokenizer(br.readLine());
        tri[0] = Integer.parseInt(st.nextToken());
        tri[1] = Integer.parseInt(st.nextToken());
        tri[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(tri);
        if (tri[0] + tri[1] > tri[2]) {
            System.out.println(tri[0] + tri[1] + tri[2]);
        } else {
            System.out.println((tri[0] + tri[1]) * 2 - 1 );
        }
    }
}
