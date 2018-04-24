package code.yandex;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        task1();
    }
    private static void task1(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int [][] ar = new int[n][m];
        int [] r = new int[n];
        int [] c = new int[m];
        for (int i = 0; i < n; i++) {
            r[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < m; i++) {
            c[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = in.nextInt();
            }
        }
        int cr = 0, cc = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            cr = 0; cc = 0;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    if(k != j && ar[i][k] < ar[i][j]) cr++;
                }
                for (int k = 0; k < n; k++) {
                    if(k != i && ar[k][j] < ar[i][j]) cc++;
                }
            }
            if(cc == 0 && cr == 0) ans++;
        }
        System.out.println(ans);
    }
}




