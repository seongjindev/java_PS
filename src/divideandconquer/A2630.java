package divideandconquer;

import java.util.Scanner;

public class A2630 {
    static int[][] box;
    static int blue = 0;
    static int white = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        box = new int[cnt][cnt];
        for(int i=0; i<cnt; i++){
            for(int j=0; j<cnt; j++){
                box[i][j] = sc.nextInt();
            }
        }
        div(cnt, 0, 0);
        System.out.println(white);
        System.out.println(blue);
        sc.close();
    }
    static void div(int cnt, int x, int y){
        if(cnt == 0){
            if(box[x][y] == 0){
                white++;
            }else{
                blue++;
            }
            return;
        }
        if(chkColor(cnt, x, y)) {
            return;
        }

        cnt = cnt /2;
        div(cnt, x, y);
        div(cnt, cnt+x, y);
        div(cnt, x, cnt+y);
        div(cnt, cnt + x, cnt +y);
    }

    static boolean chkColor(int cnt, int x, int y) { //색종이 검사
        int chk = box[x][y];
        for(int i=x; i<x+cnt; i++){
            for(int j=y; j<y+cnt; j++){
                if(box[i][j]!=chk) return false;
            }
        }
        if(chk==0){
            white++;
        }else{
            blue++;
        }
        return true;
    }
}
