package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

//public class A15720 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int b = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        int d = Integer.parseInt(st.nextToken());
//        Integer[] bArr = new Integer[b];
//        Integer[] cArr = new Integer[c];
//        Integer[] dArr = new Integer[d];
//        int min = Math.min(b, Math.min(c, d));
//        int setSum = 0;
//        int sum = 0;
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < b; i++) {
//            bArr[i] = Integer.parseInt(st.nextToken());
//        }
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < c; i++) {
//            cArr[i] = Integer.parseInt(st.nextToken());
//        }
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < d; i++) {
//            dArr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(bArr, Collections.reverseOrder());
//        Arrays.sort(cArr, Collections.reverseOrder());
//        Arrays.sort(dArr, Collections.reverseOrder());
//        for (int i = 0; i < min; i++) {
//            int total = bArr[i] + cArr[i] + dArr[i];
//            setSum += total * 9 / 10;
//            sum += total;
//        }
//        if (b > min) {
//            for (int i = min; i < b; i++) {
//                setSum += bArr[i];
//                sum += bArr[i];
//            }
//        }
//        if (c > min) {
//            for (int i = min; i < c; i++) {
//                setSum += cArr[i];
//                sum += cArr[i];
//            }
//        }
//        if (d > min) {
//            for (int i = min; i < d; i++) {
//                setSum += dArr[i];
//                sum += dArr[i];
//            }
//        }
//        System.out.println(sum);
//        System.out.println(setSum);
//        br.close();
//    }
//}

//public class A15720 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int b = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        int d = Integer.parseInt(st.nextToken());
//        Integer[] bArr = new Integer[b];
//        Integer[] cArr = new Integer[c];
//        Integer[] dArr = new Integer[d];
//        int min = Math.min(b, Math.min(c, d));
//        int setSum = 0;
//        int sum = 0;
//        st = new StringTokenizer(br.readLine());
//        input(st, b, bArr);
//        st = new StringTokenizer(br.readLine());
//        input(st, c, cArr);
//        st = new StringTokenizer(br.readLine());
//        input(st, d, dArr);
//        for (int i = 0; i < min; i++) {
//            int total = bArr[i] + cArr[i] + dArr[i];
//            setSum += total * 9 / 10;
//            sum += total;
//        }
//        if (b > min) {
//            for (int i = min; i < b; i++) {
//                setSum += bArr[i];
//                sum += bArr[i];
//            }
//        }
//        if (c > min) {
//            for (int i = min; i < c; i++) {
//                setSum += cArr[i];
//                sum += cArr[i];
//            }
//        }
//        if (d > min) {
//            for (int i = min; i < d; i++) {
//                setSum += dArr[i];
//                sum += dArr[i];
//            }
//        }
//        System.out.println(sum);
//        System.out.println(setSum);
//        br.close();
//    }
//    public static Integer[] input(StringTokenizer st, int bcd, Integer[] arr) {
//        for (int i = 0; i < bcd; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr, Collections.reverseOrder());
//        return arr;
//    }
//}

public class A15720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        Integer[] bArr = new Integer[b];
        Integer[] cArr = new Integer[c];
        Integer[] dArr = new Integer[d];
        int min = Math.min(b, Math.min(c, d));
        int max = Math.max(b, Math.max(c, d));
        int setSum = 0;
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        input(st, b, bArr);
        st = new StringTokenizer(br.readLine());
        input(st, c, cArr);
        st = new StringTokenizer(br.readLine());
        input(st, d, dArr);
        for (int i = 0; i < max; i++) {
            if (i < min) {
                int total = bArr[i] + cArr[i] + dArr[i];
                setSum += total * 9 / 10;
                sum += total;
            } else {
                if (b > i) {
                    setSum += bArr[i];
                    sum += bArr[i];
                }
                if (c > i) {
                    setSum += cArr[i];
                    sum += cArr[i];
                }
                if (d > i) {
                    setSum += dArr[i];
                    sum += dArr[i];
                }
            }
        }
        System.out.println(sum);
        System.out.println(setSum);
        br.close();
    }
    public static Integer[] input(StringTokenizer st, int bcd, Integer[] arr) {
        for (int i = 0; i < bcd; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
}