package basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class A9437 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//        while (true) {
//            String in = br.readLine();
//            if (in.equals("0")) break;
//            st = new StringTokenizer(in);
//            int n = Integer.parseInt(st.nextToken());
//            int p = Integer.parseInt(st.nextToken());
//            for (int i = 1; i <= n; i += 2) {
//                if (p >= i && p <= i + 1) {
//                    if (p <= n / 2) {
//                        if (p % 2 == 0) {
//                            sb.append(p - 1).append(" ");
//                            sb.append(n - p + 1).append(" ");
//                            sb.append(n - p + 2).append(" ");
//                        } else {
//                            sb.append(p + 1).append(" ");
//                            sb.append(n - p).append(" ");
//                            sb.append(n - p + 1).append(" ");
//                        }
//                    } else {
//                        if (p % 2 == 0) {
//                            sb.append(n - p + 1).append(" ");
//                            sb.append(n - p + 2).append(" ");
//                            sb.append(p - 1).append(" ");
//                        } else {
//                            sb.append(n - p).append(" ");
//                            sb.append(n - p + 1).append(" ");
//                            sb.append(p + 1).append(" ");
//                        }
//                    }
//                }
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A9437 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//        while (true) {
//            String in = br.readLine();
//            if (in.equals("0")) break;
//            st = new StringTokenizer(in);
//            int n = Integer.parseInt(st.nextToken());
//            int p = Integer.parseInt(st.nextToken());
//            for (int i = 1; i <= n; i++) {
//                if (i == p) {
//                    if (p <= n / 2) {
//                        if (p % 2 == 0) {
//                            sb.append(p - 1).append(" ");
//                            sb.append(n - p + 1).append(" ");
//                            sb.append(n - p + 2).append(" ");
//                        } else {
//                            sb.append(p + 1).append(" ");
//                            sb.append(n - p).append(" ");
//                            sb.append(n - p + 1).append(" ");
//                        }
//                    } else {
//                        if (p % 2 == 0) {
//                            sb.append(n - p + 1).append(" ");
//                            sb.append(n - p + 2).append(" ");
//                            sb.append(p - 1).append(" ");
//                        } else {
//                            sb.append(n - p).append(" ");
//                            sb.append(n - p + 1).append(" ");
//                            sb.append(p + 1).append(" ");
//                        }
//                    }
//                }
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A9437 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        while (true) {
//            String[] sp = br.readLine().split(" ");
//            if (sp[0].equals("0")) break;
//            int n = Integer.parseInt(sp[0]);
//            int p = Integer.parseInt(sp[1]);
//            for (int i = 1; i <= n; i++) {
//                if (i == p) {
//                    if (p <= n / 2) {
//                        if (p % 2 == 0) {
//                            sb.append(p - 1).append(" ");
//                            sb.append(n - p + 1).append(" ");
//                            sb.append(n - p + 2).append(" ");
//                        } else {
//                            sb.append(p + 1).append(" ");
//                            sb.append(n - p).append(" ");
//                            sb.append(n - p + 1).append(" ");
//                        }
//                    } else {
//                        if (p % 2 == 0) {
//                            sb.append(n - p + 1).append(" ");
//                            sb.append(n - p + 2).append(" ");
//                            sb.append(p - 1).append(" ");
//                        } else {
//                            sb.append(n - p).append(" ");
//                            sb.append(n - p + 1).append(" ");
//                            sb.append(p + 1).append(" ");
//                        }
//                    }
//                }
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

//public class A9437 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        while (true) {
//            String[] sp = br.readLine().split(" ");
//            if (sp[0].equals("0")) break;
//            int n = Integer.parseInt(sp[0]);
//            int p = Integer.parseInt(sp[1]);
//            for (int i = 1; i <= n; i++) {
//                if (i == p) {
//                    if (p <= n / 2) {
//                        if (p % 2 == 0) {
//                            sb.append(p - 1).append(" ").append(n - p + 1).append(" ").append(n - p + 2);
//                        } else {
//                            sb.append(p + 1).append(" ").append(n - p).append(" ").append(n - p + 1);
//                        }
//                    } else {
//                        if (p % 2 == 0) {
//                            sb.append(n - p + 1).append(" ").append(n - p + 2).append(" ").append(p - 1);
//                        } else {
//                            sb.append(n - p).append(" ").append(n - p + 1).append(" ").append(p + 1);
//                        }
//                    }
//                }
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//        br.close();
//    }
//}

public class A9437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] sp = br.readLine().split(" ");
            if (sp[0].equals("0")) break;
            int n = Integer.parseInt(sp[0]);
            int p = Integer.parseInt(sp[1]);
            if (p <= n / 2) {
                if (p % 2 == 0) {
                    sb.append(p - 1).append(" ").append(n - p + 1).append(" ").append(n - p + 2);
                } else {
                    sb.append(p + 1).append(" ").append(n - p).append(" ").append(n - p + 1);
                }
            } else {
                if (p % 2 == 0) {
                    sb.append(n - p + 1).append(" ").append(n - p + 2).append(" ").append(p - 1);
                } else {
                    sb.append(n - p).append(" ").append(n - p + 1).append(" ").append(p + 1);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}