package priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class A1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<cnt; i++){
            pq.offer(Integer.parseInt(br.readLine()));
            if(pq.peek()==0){
                pq.poll();
                if(pq.peek()==null){
                    sb.append("0"+"\n");
                }else{
                    sb.append(pq.poll()+"\n");
                }
            }
        }
        System.out.println(sb);
    }
}
