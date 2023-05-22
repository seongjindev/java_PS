package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A2740 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[][] mat1 = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < m; j++) {
//                mat1[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        st = new StringTokenizer(br.readLine());
//        st.nextToken();
//        int k = Integer.parseInt(st.nextToken());
//        int[][] mat2 = new int[m][k];
//        for (int i = 0; i < m; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < k; j++) {
//                mat2[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        int[][] rst = new int[n][k];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                for (int a = 0; a < k; a++) {
//                    rst[i][a] += mat1[i][j] * mat2[j][a];
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < k; j++) {
//                System.out.print(rst[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class A2740 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        int[][] mat1 = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < m; j++) {
//                mat1[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        st = new StringTokenizer(br.readLine());
//        st.nextToken();
//        int k = Integer.parseInt(st.nextToken());
//        int[][] mat2 = new int[m][k];
//        for (int i = 0; i < m; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < k; j++) {
//                mat2[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        int[][] rst = new int[n][k];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                for (int a = 0; a < k; a++) {
//                    rst[i][a] += mat1[i][j] * mat2[j][a];
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < k; j++) {
//                sb.append(rst[i][j]).append(" ");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//    }
//}

public class A2740 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] mat1 = mat(n, m);
        st = new StringTokenizer(br.readLine());
        st.nextToken();
        int k = Integer.parseInt(st.nextToken());
        int[][] mat2 = mat(m, k);
        int[][] rst = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int a = 0; a < k; a++) {
                    rst[i][a] += mat1[i][j] * mat2[j][a];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                sb.append(rst[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static int[][] mat(int a, int b) throws IOException {
        int[][] m = new int[a][b];
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < b; j++) {
                m[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return m;
    }
}
