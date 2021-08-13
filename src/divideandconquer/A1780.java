package divideandconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1780 {
    static int[][] box;
    static int a = 0, b = 0, c = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        box = new int[cnt][cnt];
        for(int i=0; i<cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<cnt; j++){
                box[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        div(cnt, 0, 0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        br.close();
    }
    static void div(int cnt, int x, int y) {
        if(cnt==1){
            if(box[x][y]==-1) {
                a++;
            }else if(box[x][y] == 0) {
                b++;
            }else {
                c++;
            }
            return;
        }
        if(chk(cnt, x, y)){
            return;
        }
        cnt = cnt/3;
        div(cnt, x, y);
        div(cnt, x+cnt, y);
        div(cnt, x+cnt+cnt, y);
        div(cnt, x, y+cnt);
        div(cnt, x+cnt, y+cnt);
        div(cnt, x+cnt+cnt, y+cnt);
        div(cnt, x, y+cnt+cnt);
        div(cnt, x+cnt, y+cnt+cnt);
        div(cnt, x+cnt+cnt, y+cnt+cnt);
    }
    static boolean chk(int cnt, int x, int y) {
        int chkNum = box[x][y];
        for(int i=x; i<x+cnt; i++) {
            for(int j=y; j<y+cnt; j++){
                if(chkNum!=box[i][j]) return false;
            }
        }
        if(chkNum==-1) {
            a++;
        }else if(chkNum==0) {
            b++;
        }else {
            c++;
        }
        return true;
    }
}
