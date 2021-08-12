package divideandconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1992 {
    static int[][] box;
    static String rst = "";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        box = new int[cnt][cnt];
        for(int i=0; i<cnt; i++) {
            String[] split = br.readLine().split("");
            for(int j=0; j<cnt; j++){
                box[i][j] = Integer.parseInt(split[j]);
            }
        }
        div(cnt, 0, 0);
        System.out.println(rst);
    }
    static void div(int cnt, int x, int y){
        if(cnt==0){
            if(box[x][y]==0){
                rst +="0";
            }else{
                rst+="1";
            }
            return;
        }
        int chk = chkNum(cnt, x, y);
        if(chk>=0){
            rst += chk;
            return;
        }
        cnt = cnt/2;
        rst += "("; //4개가 한세트이다
        div(cnt, x, y); //순서도 중요하다
        div(cnt, x, y+cnt);
        div(cnt, x+cnt, y);
        div(cnt, x+cnt, y+cnt);
        rst+=")";
        return;

    }
    static int chkNum(int cnt, int x, int y) { //번호 확인
        int num = box[x][y];
        for(int i=x; i<x+cnt; i++){
            for(int j=y; j<y+cnt; j++){
                if(box[i][j]!=num) return -1;
            }
        }
        return num;
    }
}
