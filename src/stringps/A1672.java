package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//public class A1672 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        HashMap<Character, Integer> hm = new HashMap<>();
//        hm.put('A', 0);
//        hm.put('G', 1);
//        hm.put('C', 2);
//        hm.put('T', 3);
//        Character[][] mt = new Character[4][4];
//        mt[0] = new Character[]{'A', 'C', 'A', 'G'};
//        mt[1] = new Character[]{'C', 'G', 'T', 'A'};
//        mt[2] = new Character[]{'A', 'T', 'C', 'G'};
//        mt[3] = new Character[]{'G', 'A', 'G', 'T'};
//        int n = Integer.parseInt(br.readLine());
//        String input = br.readLine();
//        char ch = input.charAt(n - 1);
//        for (int i = n - 2; i >= 0; i--) {
//            ch = mt[hm.get(input.charAt(i))][hm.get(ch)];
//        }
//        System.out.println(ch);
//        br.close();
//    }
//}

public class A1672 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('A', 0);
        hm.put('G', 1);
        hm.put('C', 2);
        hm.put('T', 3);
        char[][] mt = new char[4][4];
        mt[0] = new char[]{'A', 'C', 'A', 'G'};
        mt[1] = new char[]{'C', 'G', 'T', 'A'};
        mt[2] = new char[]{'A', 'T', 'C', 'G'};
        mt[3] = new char[]{'G', 'A', 'G', 'T'};
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        char ch = input.charAt(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            ch = mt[hm.get(input.charAt(i))][hm.get(ch)];
        }
        System.out.println(ch);
        br.close();
    }
}