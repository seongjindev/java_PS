package dynamicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1003 {

    private static Integer[][] box; //null 값을 사용하기 위해 Integer를 사용 //다녀간 곳을 저장하기 위해 전역변수로 설정

//    private static int zero, one;
//    public static int fibo(int num){
//        if(num == 0){
//            zero++;
//            return 0;
//        }else if(num == 1){
//            one++;
//            return 1;
//        }
//        return fibo(num - 1) + fibo(num - 2);
//    }

    public static Integer[] fibo(int num){
        if(box[num][0] == null && box[num][1] == null){
            box[num][0] = fibo(num - 1)[0] + fibo(num - 2)[0];
            box[num][1] = fibo(num - 1)[1] + fibo(num - 2)[1];
        }
        return box[num];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        box = new Integer[41][2];
        box[0][0] = 1; //fibo 메서드 안에서 세팅이 가능하지만 1번쓰고 다시 사용하지 않기 때문에 초기값을 설정해준다
        box[0][1] = 0;
        box[1][0] = 0;
        box[1][1] = 1;
        for(int i = 0; i<num; i++){
            int in = Integer.parseInt(br.readLine());
            fibo(in);
            sb.append(box[in][0] + " " + box[in][1] + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}
