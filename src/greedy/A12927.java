package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A12927 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char[] ch = br.readLine().toCharArray();
//        int cnt = 0;
//        for (int i = 0; i < ch.length; i++) {
//            if (ch[i] == 'Y') {
//                cnt++;
//                for (int j = i; j < ch.length; j += i + 1) {
//                    if (ch[j] == 'Y') {
//                        ch[j] = 'N';
//                    } else {
//                        ch[j] = 'Y';
//                    }
//                }
//            }
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

public class A12927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toCharArray();
        int cnt = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'Y') {
                cnt++;
                for (int j = i; j < ch.length; j += i + 1) {
                    ch[j] = ch[j] == 'Y' ? 'N' : 'Y';
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}