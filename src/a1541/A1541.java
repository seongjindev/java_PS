package a1541;

import java.util.Scanner;

public class A1541 {
    //그리디 알고리즘
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next(); //한줄 입력 받기
        String[] inS = in.split("-");
        String[] init = inS[0].split("\\+"); //split를 사용할 때 "+"는 \\+를 사용해야함 -> split 내부의 정규식 때문
        int sum = 0;
        for(int i=0 ; i<init.length; i++){
            sum += Integer.parseInt(init[i]); //첫 마이너스가 나오기 전까지는 다 더해줘야함
        }
        if(inS.length>1){
            for(int i=1; i<inS.length; i++){
                String[] inS2 = inS[i].split("\\+");
                for(int j=0; j<inS2.length; j++){
                    sum -= Integer.parseInt(inS2[j]); //첫 마이너스 이후에는 다 빼줘야함
                }
            }
        }
        System.out.println(sum);
        sc.close(); //사용이 끝나면 닫아주어야한다
    }
}
