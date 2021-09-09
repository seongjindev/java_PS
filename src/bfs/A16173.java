import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class posA16173 {
    int x, y;
    public posA16173(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class A16173 {
    static int[][] arr;
    static boolean[][] chk;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<posA16173> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int[] dx = {1, 0};
        int[] dy = {0, 1};
        int nx, ny;
        arr = new int[n][n];
        chk = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        q.offer(new posA16173(0,0));
        chk[0][0] = true;
        while(!(q.isEmpty())) {
            posA16173 p = q.poll();

            for(int i =0; i<2; i++) {
                nx = p.x + dx[i]*arr[p.x][p.y];
                ny = p.y + dy[i]*arr[p.x][p.y];
                if (nx > n - 1 || ny > n - 1) {
                    continue;
                }
                if(chk[nx][ny]){
                    continue;
                }
                chk[nx][ny] = true;
                q.offer(new posA16173(nx, ny));
            }
        }
        System.out.println(chk[n-1][n-1]?"HaruHaru":"Hing");
        br.close();
    }
}
