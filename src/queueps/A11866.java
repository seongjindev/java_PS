package queueps;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> qu = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++) {
            qu.add(i);
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<k; j++) {
                if(i==n-1) {
                    sb.append(qu.poll());
                    break;
                }else if(j==k-1) {
                    sb.append(qu.poll() + ", ");
                    break;
                }
                qu.add(qu.poll());
            }
        }
        System.out.println("<" + sb + ">");
        sc.close();
    }
}
