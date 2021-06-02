/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progcomp;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cemody
 */
public class Easy4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[] names = {"Ben", "Allen", "John", "Adam"};
        System.out.println("List of names: " + Arrays.toString(names));
        System.out.printf("Whats your name?");
        String input = sc.nextLine();
        for (int i = 0; i < names.length; i++) {
            if (input.equalsIgnoreCase(names[i])) {
                System.out.println("Welcome " + input + "!");
            }
        }
    }
    
}
