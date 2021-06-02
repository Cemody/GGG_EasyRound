/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progcomp;

/**
 *
 * @author Cemody
 */
public class Number3 {

    public static void main(String[] args) {
        int[] num = {10, 1, 2, 7};
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            n = num[i];

            if (sumSquare(n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    static boolean sumSquare(int n) {
        for (long i = 1; i * i <= n; i++) {
            for (long j = 1; j * j <= n; j++) {
                if (i * i + j * j == n) {
                    System.out.println(i + "^2 + " + j + "^2");
                    return true;
                }
            }
        }
        return false;
    }

}
