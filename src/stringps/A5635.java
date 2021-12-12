package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int age = 20101231;
        int minAge = 100000000;
        int maxAge = 0;
        String minName = "";
        String maxName = "";
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String day = st.nextToken();
            String month = st.nextToken();
            String year = st.nextToken();
            String dmy = "";
            if (month.length() == 1) {
                dmy = year + "0" + month;
            }else {
                dmy = year + month;
            }
            if (day.length() == 1) {
                dmy += "0" + day;
            } else {
                dmy += day;
            }
            int rstAge = age - Integer.parseInt(dmy);
            if (rstAge > maxAge) {
                maxAge = rstAge;
                maxName = name;
            }
            if (rstAge < minAge) {
                minAge = rstAge;
                minName = name;
            }
        }
        System.out.println(minName);
        System.out.println(maxName);
        br.close();
    }
}

//https://www.acmicpc.net/source/35463441 클래스만들어서 하는 풀이
