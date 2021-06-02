package progcompe;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            System.out.print(i+" + ");
            sum += i;
        }
        System.out.print(num);
        sum+=num;
        System.out.println(" = " +sum);
    }
}
