package sortps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

//public class A11536 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        ArrayList<String> name = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            name.add(br.readLine());
//        }
//        ArrayList<String> nameIn = new ArrayList<>(name);
//        ArrayList<String> nameDe = new ArrayList<>(name);
//        Collections.sort(nameIn);
//        Collections.sort(nameDe, Collections.reverseOrder());
//        int chk = 1;
//        for (int i = 0; i < n; i++) {
//            if (nameIn.get(i) != name.get(i)) {
//                chk = 2;
//                break;
//            }
//        }
//        if (chk == 2) {
//            for (int i = 0; i < n; i++) {
//                if (nameDe.get(i) != name.get(i)) {
//                    chk = 3;
//                    break;
//                }
//            }
//        }
//        if (chk == 1) {
//            System.out.println("INCREASING");
//        } else if (chk == 2) {
//            System.out.println("DECREASING");
//        } else {
//            System.out.println("NEITHER");
//        }
//        br.close();
//    }
//}

//public class A11536 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] name = new String[n];
//        for (int i = 0; i < n; i++) {
//            name[i] = br.readLine();
//        }
//        String[] nameIn = name.clone();
//        String[] nameDe = name.clone();
//        Arrays.sort(nameIn);
//        Arrays.sort(nameDe, Comparator.reverseOrder());
//        int chk = 1;
//        for (int i = 0; i < n; i++) {
//            if (nameIn[i] != name[i]) {
//                chk = 2;
//                break;
//            }
//        }
//        if (chk == 2) {
//            for (int i = 0; i < n; i++) {
//                if (nameDe[i] != name[i]) {
//                    chk = 3;
//                    break;
//                }
//            }
//        }
//        if (chk == 1) {
//            System.out.println("INCREASING");
//        } else if (chk == 2) {
//            System.out.println("DECREASING");
//        } else {
//            System.out.println("NEITHER");
//        }
//        br.close();
//    }
//}

//public class A11536 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] name = new String[n];
//        for (int i = 0; i < n; i++) {
//            name[i] = br.readLine();
//        }
//        int chk = 0;
//        for (int i = 0; i < n - 1; i++) {
//            if (name[i + 1].compareTo(name[i]) > 0) {
//                chk++;
//            } else {
//                chk--;
//            }
//        }
//        if (chk == n - 1) {
//            System.out.println("INCREASING");
//        } else if (chk == 1 - n) {
//            System.out.println("DECREASING");
//        } else {
//            System.out.println("NEITHER");
//        }
//        br.close();
//    }
//}

public class A11536 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String fir = br.readLine();
        int chk = 0;
        for (int i = 1; i < n; i++) {
            String snd = br.readLine();
            if (snd.compareTo(fir) > 0) {
                chk++;
            } else {
                chk--;
            }
            fir = snd;
        }
        if (chk == n - 1) {
            System.out.println("INCREASING");
        } else if (chk == 1 - n) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
        br.close();
    }
}