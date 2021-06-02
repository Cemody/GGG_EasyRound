package progcompe;

import java.util.ArrayList;
import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int loop = in.nextInt();
        int m;
        int n;
        int diff;
        ArrayList<Integer> store = new ArrayList<>();
        for (int i = 1; i <= loop; i++) {
            
            m = in.nextInt();
            n = in.nextInt();
            diff = n-m;
            for (int j = m; j <= diff; j++) {
                if(j%2!=0) store.add(j);
            }
        }
        for (int i = 0; i < store.size(); i++) {
            System.out.println(store.get(i));
        }
    }
}
