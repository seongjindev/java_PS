package backtracking;

import java.util.Scanner;

public class A15649 {
    static int[] box; //번호를 넣는 배열
    static boolean[] tf; //사용하고 있는 번호에 대한 체크
    static StringBuilder sb = new StringBuilder(); //System.out.print 를 사용하면 시간이 길어지기 때문
    public static void back(int n, int m, int deep){
        if(deep == m){
            for (int i : box) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0; i<n; i++){
            if(tf[i]==false){
                tf[i] = true;
                box[deep] = i+1;
                back(n, m, deep+1);
                tf[i] = false;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        box = new int[m];
        tf = new boolean[n];
        int deep = 0;
        back(n, m, deep);
        System.out.println(sb);
        sc.close();
    }
}


