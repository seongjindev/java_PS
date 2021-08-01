package basicmath;

import java.util.Scanner;

public class A1002 {
    public static void main(String[] args) {
        //2개의 원이 만나는 위치
        //2점에서 만난다, 1점에서 만난다(외접, 내접), 만나지 않는다, 무한대
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<cnt; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            double dis = Math.sqrt((int)Math.pow(x1-x2,2)+(int)Math.pow(y1-y2,2));
            if(r1<r2){
                int ch = r1;
                r1 = r2;
                r2 = ch;
            }
            if(x1==x2 && y1==y2 && r1==r2){ //같다 - 무한대
                sb.append("-1"+"\n");
            }else if(r1-r2<dis && r1+r2>dis){ //2점에서 만난다
                sb.append("2"+"\n");
            }else if(r1+r2==dis || r1-r2==dis){ //1점에서 만난다
                sb.append("1"+"\n");
            }else if(r1+r2<dis || r1-r2>dis){ //만나지 않는다
                sb.append("0"+"\n");
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
