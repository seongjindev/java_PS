package stringps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A3447 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String input;
//        while ((input = br.readLine()) != null) {
//            sb.append(input.replaceAll("BUG*", "")).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A3447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;
        String regex = ".*BUG.*";
        while ((input = br.readLine()) != null) {
            while (input.matches(regex)) {
                input = input.replaceAll("BUG", "");
            }
            sb.append(input).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}