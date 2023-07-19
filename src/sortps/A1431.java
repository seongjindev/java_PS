package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//public class A1431 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[][] arr = new String[n][3];
//        for (int i = 0; i < n; i++) {
//            String s = br.readLine();
//            arr[i][0] = String.valueOf(s.length());
//            int sum = 0;
//            for (int j = 0; j < s.length(); j++) {
//                int num = s.charAt(j) - '0';
//                if (num <= 9) {
//                    sum += num;
//                }
//            }
//            arr[i][1] = String.valueOf(sum);
//            arr[i][2] = s;
//        }
//        Arrays.sort(arr, new Comparator<String[]>() {
//            @Override
//            public int compare(String[] o1, String[] o2) {
//                if (Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])) {
//                    if (Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])){
//                        return o1[2].compareTo(o2[2]);
//                    } else {
//                        return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
//                    }
//                } else {
//                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
//                }
//            }
//        });
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            sb.append(arr[i][2]).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A1431 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[][] arr = new String[n][3];
//        for (int i = 0; i < n; i++) {
//            String s = br.readLine();
//            arr[i][0] = String.valueOf(s.length());
//            int sum = 0;
//            for (int j = 0; j < s.length(); j++) {
//                int num = s.charAt(j) - '0';
//                if (num <= 9) {
//                    sum += num;
//                }
//            }
//            arr[i][1] = String.valueOf(sum);
//            arr[i][2] = s;
//        }
//        Arrays.sort(arr, (o1, o2) -> {
//            if (Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])) {
//                if (Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])){
//                    return o1[2].compareTo(o2[2]);
//                } else {
//                    return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
//                }
//            } else {
//                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
//            }
//        });
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            sb.append(arr[i][2]).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A1431 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[][] arr = new String[n][3];
//        for (int i = 0; i < n; i++) {
//            String s = br.readLine();
//            arr[i][0] = String.valueOf(s.length());
//            int sum = 0;
//            for (int j = 0; j < s.length(); j++) {
//                int num = s.charAt(j) - '0';
//                if (num <= 9) {
//                    sum += num;
//                }
//            }
//            arr[i][1] = String.valueOf(sum);
//            arr[i][2] = s;
//        }
//        Arrays.sort(arr, (o1, o2) -> {
//            if (o1[0].equals(o2[0])) {
//                if (o1[1].equals(o2[1])){
//                    return o1[2].compareTo(o2[2]);
//                } else {
//                    return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
//                }
//            } else {
//                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
//            }
//        });
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            sb.append(arr[i][2]).append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                int sum1 = 0;
                int sum2 = 0;
                for (int j = 0; j < o1.length(); j++) {
                    int num = o1.charAt(j) - '0';
                    if (num <= 9) {
                        sum1 += num;
                    }
                }
                for (int j = 0; j < o2.length(); j++) {
                    int num = o2.charAt(j) - '0';
                    if (num <= 9) {
                        sum2 += num;
                    }
                }
                if (sum1 == sum2) {
                    return o1.compareTo(o2);
                } else {
                    return sum1 - sum2;
                }
            }
            return o1.length() - o2.length();
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}