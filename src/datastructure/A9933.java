package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

//public class A9933 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            hs.add(br.readLine());
//        }
//        for (String s : hs) {
//            StringBuilder sb = new StringBuilder(s).reverse();
//            if (hs.contains(sb.toString())) {
//                int len = sb.length();
//                System.out.println(len + " " + sb.charAt((len / 2)));
//                break;
//            }
//        }
//        br.close();
//    }
//}

//public class A9933 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            hs.add(br.readLine());
//        }
//        for (String s : hs) {
//            String sb = new StringBuilder(s).reverse().toString();
//            if (hs.contains(sb)) {
//                int len = sb.length();
//                System.out.println(len + " " + sb.charAt((len / 2)));
//                break;
//            }
//        }
//        br.close();
//    }
//}

//public class A9933 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            hs.add(br.readLine());
//        }
//        for (String s : hs) {
//            String rev = new StringBuilder(s).reverse().toString();
//            if (hs.contains(rev)) {
//                int len = rev.length();
//                System.out.println(len + " " + rev.charAt((len / 2)));
//                break;
//            }
//        }
//        br.close();
//    }
//}

//public class A9933 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            hs.add(br.readLine());
//        }
//        for (String s : hs) {
//            String rev = new StringBuilder(s).reverse().toString();
//            if (hs.contains(rev)) {
//                System.out.println(rev.length() + " " + rev.charAt((rev.length() / 2)));
//                break;
//            }
//        }
//        br.close();
//    }
//}

public class A9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(br.readLine());
        }
        for (String s : hs) {
            String rev = new StringBuilder(s).reverse().toString();
            if (hs.contains(rev)) {
                sb.append(rev.length()).append(" ").append(rev.charAt(rev.length() / 2));
                break;
            }
        }
        System.out.println(sb);
        br.close();
    }
}