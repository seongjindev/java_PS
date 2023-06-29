package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class A10867 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        HashSet<Integer> in = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            in.add(Integer.parseInt(st.nextToken()));
//        }
//        int[] arr = new int[in.size()];
//        Iterator<Integer> iterator = in.iterator();
//        int num = 0;
//        while (iterator.hasNext()) {
//            arr[num] = iterator.next();
//            num++;
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        br.close();
//    }
//}

//public class A10867 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] arr = new int[2001];
//        for (int i = 0; i < n; i++) {
//            arr[Integer.parseInt(st.nextToken()) + 1000]++;
//        }
//        for (int i = 0; i < 2001; i++) {
//            if (arr[i] != 0) {
//                System.out.print((i - 1000) + " ");
//            }
//        }
//        br.close();
//    }
//}

//public class A10867 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//        sb.append(arr[0]).append(" ");
//        for (int i = 1; i < n; i++) {
//            if (arr[i] != arr[i - 1]) {
//                sb.append(arr[i]).append(" ");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A10867 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        int[] arr = new int[2001];
//        for (int i = 0; i < n; i++) {
//            arr[Integer.parseInt(st.nextToken()) + 1000]++;
//        }
//        for (int i = 0; i < 2001; i++) {
//            if (arr[i] != 0) {
//                sb.append(i - 1000).append(" ");
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> in = new HashSet<>();
        for (int i = 0; i < n; i++) {
            in.add(Integer.parseInt(st.nextToken()));
        }
        ArrayList<Integer> arr = new ArrayList<>(in);
        Collections.sort(arr);
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}