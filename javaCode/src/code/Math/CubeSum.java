package code.Math;

public class CubeSum {
    public static void main(String[] args) {
        System.out.println(findNb(24723578342962L));
    }

    private static long findNb(long i) {
        long sum = 0;
        long lim = (long)Math.pow(i, 1/3.);
        for (long j = 1; j <= lim; j++) {
            sum += j * j * j;
            if(sum == i) return j;
        }
        return -1;
    }
}
