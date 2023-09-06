package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class A16165 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        HashMap<String, ArrayList<String>> group = new HashMap<>();
//        HashMap<String, String> name = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String groupName = br.readLine();
//            int num = Integer.parseInt(br.readLine());
//            ArrayList<String> girlGroup = new ArrayList<>();
//            for (int j = 0; j < num; j++) {
//                String girl = br.readLine();
//                girlGroup.add(girl);
//                name.put(girl, groupName);
//            }
//            Collections.sort(girlGroup);
//            group.put(groupName, girlGroup);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < m; i++) {
//            String in = br.readLine();
//            int zo = Integer.parseInt(br.readLine());
//            if (zo == 1) {
//                sb.append(name.get(in)).append("\n");
//            } else {
//                for (String s : group.get(in)) {
//                    sb.append(s).append("\n");
//                }
//            }
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, String[]> group = new HashMap<>();
        HashMap<String, String> name = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String groupName = br.readLine();
            int num = Integer.parseInt(br.readLine());
            String[] girlGroup = new String[num];
            for (int j = 0; j < num; j++) {
                String girl = br.readLine();
                girlGroup[j] = girl;
                name.put(girl, groupName);
            }
            Arrays.sort(girlGroup);
            group.put(groupName, girlGroup);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String in = br.readLine();
            int zo = Integer.parseInt(br.readLine());
            if (zo == 1) {
                sb.append(name.get(in)).append("\n");
            } else {
                for (String s : group.get(in)) {
                    sb.append(s).append("\n");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}