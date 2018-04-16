package code.yandex;

import java.util.*;

public class TaskA {
    static class Node{
        int l, r;

        public Node(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Node> list = new ArrayList<>();
        int n = in.nextInt();
        int s, f;
        for (int i = 0; i < n; i++) {
            s = in.nextInt();
            f = in.nextInt();
            list.add(new Node(s,1));
            list.add(new Node(f,-1));
        }
        list.sort(Comparator.comparingInt(o -> o.l));
        int mx = 0,imx = 0;
        int k = 0;
        for (int i = 0; i < 2 * n; i++) {
            k += list.get(i).r;
            if (k > mx)
            {
                imx = list.get(i).l;
                mx = k;
            }
        }
        System.out.println(imx);
    }
}
