package dynamicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1904_2 {
    public static void main(String[] args) throws IOException {
        //1 - 1
        //2 - 2
        //3 - 3
        //4 - 5
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] box = new int[num+2];
        box[1] = 1;
        box[2] = 2;
        if(num >= 3){
            for(int i=3; i<=num; i++){
                box[i] = (box[i-2] + box[i-1]) % 15746;
            }
        }
        System.out.println(box[num]);
    }
}
