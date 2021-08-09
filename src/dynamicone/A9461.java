package dynamicone;

import java.util.Scanner;

//for문을 통해 풀기
//public class A9461 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//        Long[] box = new Long[101];
//        box[1] = 1L;
//        box[2] = 1L;
//        box[3] = 1L;
//        for(int i = 0; i<cnt ; i++){
//            int num = sc.nextInt();
//            if(box[num] == null) {
//                for(int j=4; j<=num; j++){
//                    box[j] = box[j-3] + box[j-2];
//                }
//            }
//            System.out.println(box[num]);
//        }
//        sc.close();
//    }
//}

//재귀함수로 풀기
public class A9461 {
    static Long box[];
    static long tri(int num) {
        if(num <= 3) {
            return 1;
        }else if(box[num] != null) {
            return box[num];
        }else {
            box[num] = tri(num-3) + tri(num-2);
            return box[num];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        box = new Long[101];
        for(int i = 0; i<cnt ; i++){
            int num = sc.nextInt();
            System.out.println(tri(num));
        }
        sc.close();
    }
}
