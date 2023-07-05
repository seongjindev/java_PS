package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class A11004 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        ArrayList<Integer> arr = new ArrayList<>();
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            arr.add(Integer.parseInt(st.nextToken()));
//        }
//        Collections.sort(arr);
//        System.out.println(arr.get(k - 1));
//        br.close();
//    }
//}

//public class A11004 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int k = Integer.parseInt(st.nextToken());
//        LinkedList<Integer> arr = new LinkedList<>();
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            arr.add(Integer.parseInt(st.nextToken()));
//        }
//        Collections.sort(arr);
//        System.out.println(arr.get(k - 1));
//        br.close();
//    }
//}

public class A11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
        br.close();
    }
}