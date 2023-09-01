package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class A14584 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String in = br.readLine();
//        int n = Integer.parseInt(br.readLine());
//        String[] word = new String[n];
//        String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//        LinkedList<String> ll = new LinkedList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
//        HashMap<String, String> hm = new HashMap<>();
//        for (int i = 0; i < abc.length; i++) {
//            hm.put(abc[i], abc[i]);
//        }
//        for (int i = 0; i < n; i++) {
//            word[i] = br.readLine();
//        }
//        String rst = "";
//        boolean ck = false;
//        for (int i = 0; i < abc.length; i++) {
//            rst = "";
//            for (int j = 0; j < in.length(); j++) {
//                rst += hm.get(in.substring(j, j + 1));
//            }
//            for (String s : word) {
//                if (rst.contains(s)) {
//                    ck = true;
//                    break;
//                }
//            }
//            if (ck) {
//                break;
//            }
//            ll.addFirst(ll.get(ll.size() - 1));
//            ll.removeLast();
//            for (int k = 0; k < abc.length; k++) {
//                hm.put(abc[k], ll.get(k));
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

//public class A14584 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String in = br.readLine();
//        int n = Integer.parseInt(br.readLine());
//        String[] word = new String[n];
//        for (int i = 0; i < n; i++) {
//            word[i] = br.readLine();
//        }
//        String rst = "";
//        boolean ck = false;
//        for (int i = 0; i < 26; i++) {
//            rst = "";
//            for (int j = 0; j < in.length(); j++) {
//                rst += String.valueOf((char)(((in.charAt(j) + i) - 'a') % 26 + 'a'));
//            }
//            for (String s : word) {
//                if (rst.contains(s)) {
//                    ck = true;
//                    break;
//                }
//            }
//            if (ck) {
//                break;
//            }
//        }
//        System.out.println(rst);
//        br.close();
//    }
//}

public class A14584 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String[] word = new String[n];
        for (int i = 0; i < n; i++) {
            word[i] = br.readLine();
        }
        String rst = "";
        for (int i = 0; i < 26; i++) {
            rst = "";
            for (int j = 0; j < in.length(); j++) {
                rst += String.valueOf((char)(((in.charAt(j) + i) - 'a') % 26 + 'a'));
            }
            for (String s : word) {
                if (rst.contains(s)) {
                    System.out.println(rst);
                    br.close();
                    return;
                }
            }
        }
    }
}