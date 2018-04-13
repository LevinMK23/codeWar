package code;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().solution(8));
    }
    public String solution(long n){
        float sum = 0;
        int co = 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
                if(i <= n)sum += arrSum(1, i) / (i + 1);
                else {
                    sum += arrSum(co, n) / (i + 1);
                    co++;
                }
        }
        if(sum * 10 == (int)sum * 10)
            return "[" + String.valueOf((int)sum) + "]";
        else {
            String s = String.valueOf(sum);
            //System.out.println(s);
            int [] d = new int[2];
            int pos = 0, r = 1, exp = 1;
            for (int i = s.length() - 1; i >= 0; i--) {
                if(s.charAt(i) == '.') {
                    pos = 1;
                    exp = s.length() - i - 1;
                    r = 1;
                    continue;
                }
                d[pos] += r * (s.charAt(i) - '0');
                r *= 10;

            }
            long chis = d[0] + d[1];
            long znam = (long) Math.pow(10, exp);
            long gcd = gcd(chis, znam);
            //System.out.println(sum);
            //System.out.println(chis + " " + znam);
            return String.format("[%d, %d]", chis / gcd, znam / gcd);
        }
    }

    private float arrSum(long from, long to) {
        if(from == to) return from;
        return (float) ((from + to) / 2. ) * (to - from + 1);
    }

    private long gcd(long chis, long znam) {
        if(chis == 0) return znam;
        if(znam == 0) return chis;
        if(chis > znam) return gcd(chis % znam, znam);
        else return gcd(chis, znam % chis);
    }
}
