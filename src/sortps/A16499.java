package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

//public class A16499 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] arr = new String[n];
//        for (int i = 0; i < n; i++) {
//            String in = br.readLine();
//            String[] str = new String[in.length()];
//            for (int j = 0; j < in.length(); j++) {
//                str[j] = in.substring(j, j + 1);
//            }
//            Arrays.sort(str);
//            arr[i] = "";
//            for (int k = 0; k < in.length(); k++) {
//                arr[i] += str[k];
//            }
//        }
//        Arrays.sort(arr);
//        int cnt = 1;
//        for (int i = 0; i < n - 1; i++) {
//            if (!arr[i].equals(arr[i + 1])) {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

//public class A16499 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] arr = new String[n];
//        for (int i = 0; i < n; i++) {
//            char[] ch = br.readLine().toCharArray();
//            Arrays.sort(ch);
//            arr[i] = "";
//            for (char c : ch) {
//                arr[i] += c;
//            }
//        }
//        Arrays.sort(arr);
//        int cnt = 1;
//        for (int i = 0; i < n - 1; i++) {
//            if (!arr[i].equals(arr[i + 1])) {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

//public class A16499 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] arr = new String[n];
//        for (int i = 0; i < n; i++) {
//            char[] ch = br.readLine().toCharArray();
//            Arrays.sort(ch);
//            arr[i] = "";
//            for (char c : ch) {
//                arr[i] += c;
//            }
//        }
//        Arrays.sort(arr);
//        int cnt = 1;
//        for (int i = 0; i < n - 1; i++) {
//            if (!arr[i].equals(arr[i + 1])) {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//        br.close();
//    }
//}

//public class A16499 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            char[] ch = br.readLine().toCharArray();
//            Arrays.sort(ch);
//            String str = new String();
//            for (char c : ch) {
//                str += c;
//            }
//            hs.add(str);
//        }
//        System.out.println(hs.size());
//        br.close();
//    }
//}

//public class A16499 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            char[] ch = br.readLine().toCharArray();
//            Arrays.sort(ch);
//            String str = "";
//            for (char c : ch) {
//                str += c;
//            }
//            hs.add(str);
//        }
//        System.out.println(hs.size());
//        br.close();
//    }
//}

//public class A16499 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            String in = br.readLine();
//            String[] str = new String[in.length()];
//            for (int j = 0; j < in.length(); j++) {
//                str[j] = in.substring(j, j + 1);
//            }
//            Arrays.sort(str);
//            String chk = "";
//            for (int k = 0; k < in.length(); k++) {
//                chk += str[k];
//            }
//            hs.add(chk);
//        }
//        System.out.println(hs.size());
//        br.close();
//    }
//}

//public class A16499 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        HashSet<String> hs = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            String[] sp = br.readLine().split("");
//            Arrays.sort(sp);
//            StringBuilder chk = new StringBuilder();
//            for (String s : sp) {
//                chk.append(s);
//            }
//            hs.add(chk.toString());
//        }
//        System.out.println(hs.size());
//        br.close();
//    }
//}

public class A16499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] sp = br.readLine().split("");
            Arrays.sort(sp);
            String chk = "";
            for (int k = 0; k < sp.length; k++) {
                chk += sp[k];
            }
            hs.add(chk);
        }
        System.out.println(hs.size());
        br.close();
    }
}