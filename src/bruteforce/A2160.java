package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class A2160 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        char[][] paint = new char[5 * n][7];
//        int min = (5 * 7) + 1;
//        for (int i = 0; i < n * 5; i++) {
//            paint[i] = br.readLine().toCharArray();
//        }
//        int num1 = 0;
//        int num2 = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int ck = 0;
//                for (int a = 0; a < 5; a++) {
//                    for (int b = 0; b < 7; b++) {
//                        if (paint[(i * 5) + a][b] != paint[(j * 5) + a][b]) {
//                            ck++;
//                        }
//                    }
//                }
//                if (ck < min) {
//                    min = ck;
//                    num1 = i + 1;
//                    num2 = j + 1;
//                }
//            }
//        }
//        System.out.println(num1 + " " + num2);
//        br.close();
//    }
//}

//public class A2160 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        char[][] paint = new char[5 * n][7];
//        int min = (5 * 7) + 1;
//        for (int i = 0; i < n * 5; i++) {
//            paint[i] = br.readLine().toCharArray();
//        }
//        int num1 = 0;
//        int num2 = 0;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int ck = 0;
//                for (int a = 0; a < 5; a++) {
//                    for (int b = 0; b < 7; b++) {
//                        if (paint[(i * 5) + a][b] != paint[(j * 5) + a][b]) {
//                            ck++;
//                        }
//                    }
//                }
//                if (ck < min) {
//                    min = ck;
//                    num1 = i + 1;
//                    num2 = j + 1;
//                }
//            }
//        }
//        System.out.println(num1 + " " + num2);
//        br.close();
//    }
//}

//public class A2160 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        char[][][] paint = new char[n][5][7];
//        int min = (5 * 7) + 1;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 5; j++) {
//                paint[i][j] = br.readLine().toCharArray();
//            }
//        }
//        int num1 = 0;
//        int num2 = 0;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int ck = 0;
//                for (int a = 0; a < 5; a++) {
//                    for (int b = 0; b < 7; b++) {
//                        if (paint[i][a][b] != paint[j][a][b]) {
//                            ck++;
//                        }
//                    }
//                }
//                if (ck < min) {
//                    min = ck;
//                    num1 = i + 1;
//                    num2 = j + 1;
//                }
//            }
//        }
//        System.out.println(num1 + " " + num2);
//        br.close();
//    }
//}

public class A2160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][][] paint = new char[n][5][7];
        int min = (5 * 7) + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                String in = br.readLine();
                for (int k = 0; k < 7; k++) {
                    paint[i][j][k] = in.charAt(k);
                }
            }
        }
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int ck = 0;
                for (int a = 0; a < 5; a++) {
                    for (int b = 0; b < 7; b++) {
                        if (paint[i][a][b] != paint[j][a][b]) {
                            ck++;
                        }
                    }
                }
                if (ck < min) {
                    min = ck;
                    num1 = i + 1;
                    num2 = j + 1;
                }
            }
        }
        System.out.println(num1 + " " + num2);
        br.close();
    }
}