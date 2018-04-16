package code.Math;

import java.util.Arrays;

public class Xbonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Xbonacci().xbonacci(new double[]{1,0,0,0,0,0,1}, 10)));
    }

    public double[] xbonacci(double[] signature, int n) {
        int l = signature.length;
        double [] ans = new double[n];
        if(l > n){
            System.arraycopy(signature, 0, ans, 0, n);
            return ans;
        }
        System.arraycopy(signature, 0, ans, 0, l);
        for (int i = l; i < n; i++) {
            for (int j = i-1; j >= i - l; j--) {
                ans[i] += ans[j];
            }
        }
        return ans;
    }
}
