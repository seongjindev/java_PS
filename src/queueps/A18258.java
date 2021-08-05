package queueps;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

class QueueMake {
    private List<Integer> arr = new LinkedList<>();
    //ArrayList를 사용하면 시간초과남
    //ArrayList는 검색할땐 빠르지만 추가나 삭제할때 느림
    //반면 LinkedList는 추가나 삭제할때 빠르지만 검색할땐 느림

    public void push(int x) {
        this.arr.add(x);
    }
    public int pop() {
        if(this.arr.size()==0) {
            return -1;
        }else {
            Integer integer = this.arr.get(0);
            this.arr.remove(0);
            return integer;
        }
    }
    public int size() {
        return this.arr.size();
    }
    public int empty() {
        if(this.arr.size()==0) {
            return 1;
        }else {
            return 0;
        }
    }
    public int front() {
        if(this.arr.size()==0) {
            return -1;
        }else {
            return this.arr.get(0);
        }
    }
    public int back() {
        if(this.arr.size()==0) {
            return -1;
        }else {
            return this.arr.get(arr.size() - 1);
        }
    }

}

public class A18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        QueueMake queueMake = new QueueMake();
        for(int i = 0; i < cnt; i++){
            String in = br.readLine();
            if(in.startsWith("push")) {
                String[] sp = in.split(" ");
                queueMake.push(Integer.parseInt(sp[1]));
            }else if(in.equals("pop")) {
                bw.write(queueMake.pop() + "\n");
            }else if(in.equals("size")) {
                bw.write(queueMake.size() + "\n");
            }else if(in.equals("empty")) {
                bw.write(queueMake.empty() + "\n");
            }else if(in.equals("front")) {
                bw.write(queueMake.front() + "\n");
            }else if(in.equals("back")) {
                bw.write(queueMake.back() + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
