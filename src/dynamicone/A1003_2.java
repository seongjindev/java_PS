package dynamicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1003_2 {
//    static int fibona(int n){
//        if(n==0){
//            return 0;
//        }else if(n==1){
//            return 1;
//        }else{
//            return fibona(n-1) + fibona(n-2);
//        }
//    }

    static Integer[][] box;
    static Integer[] fibona(int n) {
        if(box[n][0] == null && box[n][1] == null){
            box[n][0] = fibona(n-1)[0] + fibona(n-2)[0];
            box[n][1] = fibona(n-1)[1] + fibona(n-2)[1];
        }
        return box[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        box = new Integer[41][2];
        box[0][0] = 1;
        box[0][1] = 0;
        box[1][0] = 0;
        box[1][1] = 1;
        for(int i=0; i<cnt; i++){
            int num = Integer.parseInt(br.readLine());
            fibona(num);
            sb.append(box[num][0] + " " + box[num][1] + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}
