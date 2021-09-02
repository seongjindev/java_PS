package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

class Qu {

    static List<Integer> list = new LinkedList<>();

    static void push(int n) {
        list.add(n);
    }

    static int pop() {
        if(list.size()==0) {
            return -1;
        }
        Integer integer = list.get(0);
        list.remove(0);
        return integer;
    }

    static int size() {
        return list.size();
    }

    static int empty() {
        if(list.size()==0) {
            return 1;
        }
        return 0;
    }

    static int front() {
        if(list.size()==0) {
            return -1;
        }
        return list.get(0);
    }

    static int back() {
        if(list.size()==0) {
            return -1;
        }
        return list.get(list.size()-1);
    }
}


public class A10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String chk = st.nextToken();
            if (chk.equals("push")) {
                Qu.push(Integer.parseInt(st.nextToken()));
            } else if (chk.equals("pop")) {
                sb.append(Qu.pop() + "\n");
            } else if (chk.equals("size")) {
                sb.append(Qu.size() + "\n");
            } else if (chk.equals("empty")) {
                sb.append(Qu.empty() + "\n");
            } else if (chk.equals("front")) {
                sb.append(Qu.front() + "\n");
            } else if (chk.equals("back")) {
                sb.append(Qu.back() + "\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
