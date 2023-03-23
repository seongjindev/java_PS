package geometryps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//public class A5073 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        ArrayList<Integer> tri = new ArrayList<>();
//        tri.add(Integer.parseInt(st.nextToken()));
//        tri.add(Integer.parseInt(st.nextToken()));
//        tri.add(Integer.parseInt(st.nextToken()));
//        while (tri.get(0)+tri.get(1)+tri.get(2) != 0) {
//            Collections.sort(tri);
//            if (tri.get(0).equals(tri.get(1)) && tri.get(1).equals(tri.get(2))) {
//                System.out.println("Equilateral");
//            } else if (tri.get(0) + tri.get(1) > tri.get(2)) {
//                if (tri.get(0).equals(tri.get(1)) || tri.get(1).equals(tri.get(2)) || tri.get(2).equals(tri.get(0))) {
//                    System.out.println("Isosceles");
//                } else {
//                    System.out.println("Scalene");
//                }
//            }else {
//                System.out.println("Invalid");
//            }
//            tri.clear();
//            st = new StringTokenizer(br.readLine());
//            tri.add(Integer.parseInt(st.nextToken()));
//            tri.add(Integer.parseInt(st.nextToken()));
//            tri.add(Integer.parseInt(st.nextToken()));
//        }
//    }
//}

public class A5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] tri = new int[3];
        while (true) {
            st = new StringTokenizer(br.readLine());
            tri[0] = Integer.parseInt(st.nextToken());
            tri[1] = Integer.parseInt(st.nextToken());
            tri[2] = Integer.parseInt(st.nextToken());
            if (tri[0] + tri[1] + tri[2] == 0) {
                break;
            }
            Arrays.sort(tri);
            if (tri[0] == tri[1] && tri[1] == tri[2]) {
                System.out.println("Equilateral");
            } else if (tri[2] < tri[0] + tri[1]) {
                if (tri[0] == tri[1] || tri[1] == tri[2] || tri[2] == tri[0]) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
