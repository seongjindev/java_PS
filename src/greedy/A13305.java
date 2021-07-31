package greedy;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A13305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        Queue<Long> km = new LinkedList<>();
        Queue<Long> pc = new LinkedList<>();
        long rst = 0;
        for(int i=0; i<cnt-1; i++){
            km.offer(sc.nextLong());
        }
        for(int i=0; i<cnt; i++){
            pc.offer(sc.nextLong());
        }
        long fir = pc.poll();
        long oil = 0;
        while(!(km.isEmpty())){
            long snd = pc.poll();
            oil = km.poll();
            if (fir >= snd) {
                rst += fir*oil;
                fir = snd;
            }else{
                rst += fir*oil;
            }
        }
        System.out.println(rst);
        sc.close();
    }
}
