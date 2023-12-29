package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A17294 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String k = br.readLine();
//        String rst = "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!";
//        if (k.length() > 1) {
//            int n = k.charAt(0) - k.charAt(1);
//            for (int i = 1; i < k.length() - 1; i++) {
//                if (k.charAt(i) - k.charAt(i + 1) != n) {
//                    rst = "흥칫뿡!! <(￣ ﹌ ￣)>";
//                    break;
//                }
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A17294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String k = br.readLine();
        String rst = "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!";
        for (int i = 1; i < k.length() - 1; i++) {
            if (k.charAt(i - 1) - k.charAt(i) != k.charAt(i) - k.charAt(i + 1)) {
                rst = "흥칫뿡!! <(￣ ﹌ ￣)>";
                break;
            }
        }
        System.out.println(rst);
        br.close();
    }
}