package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//public class A20154 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        HashMap<Character, Integer> hm = new HashMap<>();
//        hm.put('A', 3);
//        hm.put('B', 2);
//        hm.put('C', 1);
//        hm.put('D', 2);
//        hm.put('E', 3);
//        hm.put('F', 3);
//        hm.put('G', 3);
//        hm.put('H', 3);
//        hm.put('I', 1);
//        hm.put('J', 1);
//        hm.put('K', 3);
//        hm.put('L', 1);
//        hm.put('M', 3);
//        hm.put('N', 3);
//        hm.put('O', 1);
//        hm.put('P', 2);
//        hm.put('Q', 2);
//        hm.put('R', 2);
//        hm.put('S', 3);
//        hm.put('T', 2);
//        hm.put('U', 1);
//        hm.put('V', 1);
//        hm.put('W', 2);
//        hm.put('X', 2);
//        hm.put('Y', 2);
//        hm.put('Z', 1);
//        String input = br.readLine();
//        int rst = 0;
//        for (int i = 0; i < input.length(); i++) {
//            rst += hm.get(input.charAt(i)) % 10;
//        }
//        if (rst % 2 == 0) {
//            System.out.println("You're the winner?");
//        } else {
//            System.out.println("I'm a winner!");
//        }
//        br.close();
//    }
//}

//public class A20154 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        HashMap<Character, Integer> hm = new HashMap<>();
//        hm.put('A', 3);
//        hm.put('B', 2);
//        hm.put('C', 1);
//        hm.put('D', 2);
//        hm.put('E', 3);
//        hm.put('F', 3);
//        hm.put('G', 3);
//        hm.put('H', 3);
//        hm.put('I', 1);
//        hm.put('J', 1);
//        hm.put('K', 3);
//        hm.put('L', 1);
//        hm.put('M', 3);
//        hm.put('N', 3);
//        hm.put('O', 1);
//        hm.put('P', 2);
//        hm.put('Q', 2);
//        hm.put('R', 2);
//        hm.put('S', 3);
//        hm.put('T', 2);
//        hm.put('U', 1);
//        hm.put('V', 1);
//        hm.put('W', 2);
//        hm.put('X', 2);
//        hm.put('Y', 2);
//        hm.put('Z', 1);
//        String input = br.readLine();
//        int rst = 0;
//        for (int i = 0; i < input.length(); i++) {
//            rst += hm.get(input.charAt(i));
//            rst %= 10;
//        }
//        if (rst % 2 == 0) {
//            System.out.println("You're the winner?");
//        } else {
//            System.out.println("I'm a winner!");
//        }
//        br.close();
//    }
//}

//public class A20154 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] num = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
//        String input = br.readLine();
//        int rst = 0;
//        for (int i = 0; i < input.length(); i++) {
//            rst += num[(input.charAt(i) - 'A')];
//            rst %= 10;
//        }
//        if (rst % 2 == 0) {
//            System.out.println("You're the winner?");
//        } else {
//            System.out.println("I'm a winner!");
//        }
//        br.close();
//    }
//}

public class A20154 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
        String input = br.readLine();
        int rst = 0;
        for (int i = 0; i < input.length(); i++) {
            rst += num[(input.charAt(i) - 'A')];
        }
        if (rst % 2 == 0) {
            System.out.println("You're the winner?");
        } else {
            System.out.println("I'm a winner!");
        }
        br.close();
    }
}