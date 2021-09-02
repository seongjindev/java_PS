package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

class De {

    static List<Integer> list = new LinkedList<>();

    static void push_front(int n) {
        list.add(0, n);
    }
    static void push_back(int n) {
        list.add(n);
    }

    static int pop_front() {
        if(list.size()==0) {
            return -1;
        }
        Integer integer = list.get(0);
        list.remove(0);
        return integer;
    }

    static int pop_back() {
        if(list.size()==0) {
            return -1;
        }
        Integer integer = list.get(list.size()-1);
        list.remove(list.size()-1);
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
public class A10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String chk = st.nextToken();
            if (chk.equals("push_front")) {
                De.push_front(Integer.parseInt(st.nextToken()));
            } else if (chk.equals("push_back")) {
                De.push_back(Integer.parseInt(st.nextToken()));
            } else if (chk.equals("pop_front")) {
                sb.append(De.pop_front() + "\n");
            } else if (chk.equals("pop_back")) {
                sb.append(De.pop_back() + "\n");
            } else if (chk.equals("size")) {
                sb.append(De.size() + "\n");
            } else if (chk.equals("empty")) {
                sb.append(De.empty() + "\n");
            } else if (chk.equals("front")) {
                sb.append(De.front() + "\n");
            } else if (chk.equals("back")) {
                sb.append(De.back() + "\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
