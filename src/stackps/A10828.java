package stackps;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

class StackPs {

//    private List<Integer> arr = new ArrayList<>();
    private List<Integer> arr = new LinkedList<>();

    public void push(int x){
        this.arr.add(x);
    }
    public int pop(){
        if(this.arr.size()>0){
            Integer integer = this.arr.get(arr.size()-1);
            this.arr.remove(arr.size()-1);
            return integer;
        }else{
            return -1;
        }
    }
    public int size(){
        int size = this.arr.size();
        return size;
    }
    public int empty(){
        if(this.arr.size()==0){
            return 1;
        }else{
            return 0;
        }
    }
    public int top(){
        if(this.arr.size()>0){
            Integer integer = this.arr.get(arr.size()-1);
            return integer;
        }else{
            return -1;
        }
    }
}

//class StackPs {
//
//    //    private List<Integer> arr = new ArrayList<>();
//    private List<Integer> arr = new LinkedList<>();
//
//    public void push(int x){
//        this.arr.add(x);
//    }
//    public void pop(){
//        if(this.arr.size()>0){
//            Integer integer = this.arr.get(arr.size()-1);
//            this.arr.remove(arr.size()-1);
//            System.out.println(integer);
//        }else{
//            System.out.println(-1);
//        }
//    }
//    public void size(){
//        int size = this.arr.size();
//        System.out.println(size);
//    }
//    public void empty(){
//        if(this.arr.size()==0){
//            System.out.println(1);
//        }else{
//            System.out.println(0);
//        }
//    }
//    public void top(){
//        if(this.arr.size()>0){
//            Integer integer = this.arr.get(arr.size()-1);
//            System.out.println(integer);
//        }else{
//            System.out.println(-1);
//        }
//    }
//}

public class A10828 {
    public static void main(String[] args) throws IOException {
        // ArrayList 와 LinkedList 차이 - 크게 차이없음
        // return 을 받아서 프린트 할것인가? 아니면 함수내에서 프린트 할것인가? - 크게 차이없음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner는 느리다
        int cnt = Integer.parseInt(br.readLine());
        StackPs sp = new StackPs();
//        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<cnt; i++){
            String in = br.readLine();
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            String in = st.nextToken();
            if(in.startsWith("push")){
                String[] inArr = in.split(" ");
                // split은 정규식을 사용하기 때문에 느리다고 한다
                // StringTokenizer을 사용해보자
//                sp.push(Integer.parseInt(st.nextToken()));
                sp.push(Integer.parseInt(inArr[1]));
            }else if(in.equals("pop")){
//                System.out.println(sp.pop());
//                sp.pop();
//                sb.append(sp.pop() + "\n");
                bw.write(sp.pop() + "\n");
            }else if(in.equals("size")){
//                System.out.println(sp.size());
//                sp.size();
//                sb.append(sp.size() + "\n");
                bw.write(sp.size() + "\n");
            }else if(in.equals("empty")){
//                System.out.println(sp.empty());
//                sp.empty();
//                sb.append(sp.empty() + "\n");
                bw.write(sp.empty() + "\n");
            }else if(in.equals("top")){
//                System.out.println(sp.top());
//                sp.top();
//                sb.append(sp.top() + "\n");
                bw.write(sp.top() + "\n");
            }
//            bw.flush();
        }
//        System.out.println(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}
