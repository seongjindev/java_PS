package dynamicone;

import java.util.Scanner;

public class A9461_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        long[] box = new long[101];
        box[0] = 0;
        box[1] = 1;
        box[2] = 1;
        for(int i=0; i<cnt; i++){
            int in = sc.nextInt();
            if(in>2){
                for(int j=3; j<=in; j++){
                    box[j] = box[j-3] + box[j-2];
                }
            }
            System.out.println(box[in]);
        }
        sc.close();
    }
}
