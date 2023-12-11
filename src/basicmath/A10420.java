package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class A10420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LocalDate rst = LocalDate.of(2014, 4, 2).plusDays(Long.parseLong(br.readLine()) - 1);
        System.out.println(rst);
        br.close();
    }
}