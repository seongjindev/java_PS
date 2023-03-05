package reps;

import java.io.*;
import java.util.Scanner;

//public class A25314 {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt() / 4;
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for (int i = 0; i < n; i++) {
//            bw.write("long ");
//        }
//        bw.write("int");
//        bw.flush();
//        bw.close();
//        sc.close();
//    }
//}

public class A25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) / 4;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write("long ");
        }
        bw.write("int");
        bw.flush();
        bw.close();
        br.close();
    }
}

