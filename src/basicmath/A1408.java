package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

//public class A1408 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] stArr = br.readLine().split(":");
//        String[] edArr = br.readLine().split(":");
//        String rst;
//        LocalDateTime st = LocalDateTime.of(1, 1, 1, Integer.parseInt(stArr[0]), Integer.parseInt(stArr[1]), Integer.parseInt(stArr[2]));
//        LocalDateTime ed = LocalDateTime.of(1, 1, 1, Integer.parseInt(edArr[0]), Integer.parseInt(edArr[1]), Integer.parseInt(edArr[2]));
//        if (Integer.parseInt(stArr[0]) > Integer.parseInt(edArr[0])) {
//            ed = ed.plusDays(1);
//        }
//        Duration bw = Duration.between(st, ed);
//        rst = String.format("%02d:%02d:%02d", bw.toHours(), bw.toMinutes() % 60, bw.toSeconds() % 60);
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A1408 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stArr = br.readLine().split(":");
        String[] edArr = br.readLine().split(":");
        int h = Integer.parseInt(edArr[0]) - Integer.parseInt(stArr[0]);
        int m = Integer.parseInt(edArr[1]) - Integer.parseInt(stArr[1]);
        int s = Integer.parseInt(edArr[2]) - Integer.parseInt(stArr[2]);
        if (s < 0) {
            m--;
            s += 60;
        }
        if (m < 0) {
            h--;
            m += 60;
        }
        if (h < 0) {
            h += 24;
        }
        System.out.printf("%02d:%02d:%02d", h, m, s);
        br.close();
    }
}


