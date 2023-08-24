package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//public class A2870 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<String> al = new ArrayList<>();
//        String chk = "";
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            char[] ch = br.readLine().toCharArray();
//            boolean zr = false;
//            for (int j = 0; j < ch.length; j++) {
//                if (ch[j] >= 48 && ch[j] <= 57) {
//                    if (chk.equals("") && ch[j] == 48) {
//                        chk = "0";
//                        zr = true;
//                    } else {
//                        if (zr && ch[j] != 48) {
//                            chk = "";
//                            zr = false;
//                        }
//                        if (!zr) {
//                            chk += ch[j] - '0';
//                        }
//                    }
//                } else {
//                    if (!chk.equals("")) {
//                        al.add(chk);
//                        max = Math.max(max, chk.length());
//                    }
//                    chk = "";
//                }
//            }
//            if (!chk.equals("")) {
//                al.add(chk);
//                max = Math.max(max, chk.length());
//            }
//            chk = "";
//        }
//        Collections.sort(al);
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= max; i++) {
//            for (String s : al) {
//                if (s.length() == i) {
//                    sb.append(s).append("\n");
//                }
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] sp = br.readLine().split("\\D");
            for (String s : sp) {
                while (s.startsWith("0") && s.length() > 1) {
                    s = s.substring(1);
                }
                if (!s.isBlank()) {
                    al.add(s);
                }
            }
        }
        Collections.sort(al, (o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            }
            return o1.compareTo(o2);
        });
        StringBuilder sb = new StringBuilder();
        for (String s : al) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}