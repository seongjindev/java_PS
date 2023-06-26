package sortps;

import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

//public class A16212 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        br.close();
//    }
//}

//public class A16212 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<Integer> arr = new ArrayList<>();
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            arr.add(Integer.parseInt(st.nextToken()));
//        }
//        Collections.sort(arr);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        br.close();
//    }
//}

//public class A16212 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//        for (int i : arr) {
//            bw.write(i + " ");
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}

//public class A16212 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<Integer> arr = new ArrayList<>();
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            arr.add(Integer.parseInt(st.nextToken()));
//        }
//        Collections.sort(arr);
//        for (int i : arr) {
//            bw.write(i + " ");
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}

public class A16212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[4000001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(st.nextToken()) + 2000000]++;
        }
        for (int i = 0; i < 4000001; i++) {
            if (arr[i] > 0) {
                for (int j = 0; j < arr[i]; j++) {
                    bw.write(Integer.toString(i - 2000000));
                    bw.write(" ");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}