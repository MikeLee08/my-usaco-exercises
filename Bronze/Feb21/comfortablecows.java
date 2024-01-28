import java.util.*;

public class comfortablecows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] count = new int[N];
        int[][] grid = new int[2002][2002];
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt() + 1_000;
            int y = scanner.nextInt() + 1_000;
            int comfortable = 0;

            for (int j = 0; j < 4; j++) {
                int nx = x + dx[j];
                int ny = y + dy[j];
                comfortable += grid[nx][ny];
            }

            for (int j = 0; j < 4; j++) {
                int nx = x + dx[j];
                int ny = y + dy[j];
                grid[nx][ny]++;
            }

            count[i] = comfortable;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(count[i]);
        }
    }
}


//import java.util.Scanner;
//public class comfortablecows {
//    public static boolean main(String[] args) {
//        final int MAXN = 1001;
//        int N;
//        boolean[][] A = new boolean[MAXN][MAXN];
//        int[] dx = {-1, 1, 0, 0};
//        int[] dy = {0, 0, -1, 1};
//
//        static boolean validPosition ( int x, int y){
//            return x >= 0 && x <= N && y >= 0 && y <= N;
//        }
//
//        static boolean comfortable ( int x, int y){
//            if (!A[x][y]) return false;
//            int neighbors = 0;
//            for (int d = 0; d < 4; d++) {
//                if (validPosition(x + dx[d], y + dy[d]) && A[x + dx[d]][y + dy[d]]) {
//                    neighbors++;
//                }
//            }
//            return neighbors == 3;
//        }
//
//        public static void comfortablecows (String[]args){
//            Scanner input = new Scanner(System.in);
//            int x, y;
//            N = input.nextInt();
//            int nComfortable = 0;
//
//            for (int i = 0; i < N; i++) {
//                x = input.nextInt();
//                y = input.nextInt();
//
//                for (int d = 0; d < 4; d++) {
//                    if (validPosition(x + dx[d], y + dy[d])) {
//                        nComfortable -= comfortable(x + dx[d], y + dy[d]);
//                    }
//                }
//
//                A[x][y] = true;
//
//                for (int d = 0; d < 4; d++) {
//                    if (validPosition(x + dx[d], y + dy[d])) {
//                        // You can add code here for further processing
//                    }
//                }
//            }
//            input.close();
//        }
//    }
//
//    private static int comfortable(int i, int i1) {
//    }
//
//    private static boolean validPosition(int i, int i1) {
//        boolean b = false;
//        return b;
//    }
