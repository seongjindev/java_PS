package dynamicone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1003_3 {
    static Integer[][] box;
    static Integer[] fib(int num) {
        if (box[num][0] == null || box[num][1] == null) {
            box[num][0] = fib(num-1)[0] + fib(num-2)[0];
            box[num][1] = fib(num-1)[1] + fib(num-2)[1];;
        }
        return box[num];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        box = new Integer[41][2];
        box[0][0] = 1;
        box[0][1] = 0;
        box[1][0] = 0;
        box[1][1] = 1;
        for (int i = 0; i < cnt; i++) {
            int num = Integer.parseInt(br.readLine());
            fib(num);
            sb.append(box[num][0] + " " + box[num][1] + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}
