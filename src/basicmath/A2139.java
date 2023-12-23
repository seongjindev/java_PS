package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

//public class A2139 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        while (true) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int d = Integer.parseInt(st.nextToken());
//            int m = Integer.parseInt(st.nextToken());
//            int y = Integer.parseInt(st.nextToken());
//            if (d == 0 && m == 0 && y == 0) {
//                break;
//            }
//            LocalDate first = LocalDate.of(y, 1, 1);
//            LocalDate current = LocalDate.of(y, m, d);
//            long bt = ChronoUnit.DAYS.between(first, current);
//            sb.append(bt + 1).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A2139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (d == 0 && m == 0 && y == 0) {
                break;
            }
            LocalDate first = LocalDate.of(y, 1, 1);
            LocalDate current = LocalDate.of(y, m, d);
            long bt = ChronoUnit.DAYS.between(first, current);
            sb.append(bt + 1).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}