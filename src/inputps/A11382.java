package inputps;

import java.util.Scanner;

//public class A11382 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        long one = Long.parseLong(st.nextToken());
//        long two = Long.parseLong(st.nextToken());
//        long thr = Long.parseLong(st.nextToken());
//        System.out.println(one + two + thr);
//    }
//}

public class A11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        System.out.println(a + b + c);
        sc.close();
    }
}
