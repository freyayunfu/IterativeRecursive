/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativerecursive;

import java.util.Scanner;

/**
 * This class write the iterative and recursive versions of function T.
 * @author FU, Yun
 * @version 1.0
 * @since 15/09/2014
 */
public class IterativeRecursive {

    /**
     * This method input the parameter of function T and output the results.
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Enter an integer as the parameter of function T : ");
        Scanner a = new Scanner(System.in);

        int b = a.nextInt();
        System.out.println("The result of iterative version of function T : ");
        System.out.println(IterativeT(b));
        System.out.println("The result of recursive version of function T : ");
        System.out.println(RecursiveT(b));

    }

    /**
     * This method write the recursive versions of function T
     *
     * @param n the parameter of function T
     * @return result of function T with the parameter given
     */
    public static int RecursiveT(int n) {
        if (n == 0) {
            return 3;
        }
        if (n == 1) {
            return 5;
        } else {
            return RecursiveT(n - 1) + 5 * RecursiveT(n - 2) + n + 3;
        }
    }

    /**
     * This method write the iterativeT versions of function T
     *
     * @param n the parameter of function T
     * @return result of function T with the parameter given
     */
    public static int IterativeT(int n) {
        int y = 3;
        int x = 5;
        int z = 0;

        if (n == 0) {
            return 3;
        }
        if (n == 1) {
            return 5;
        } else {
            for (int i = 2; i < n + 1; i++) {

                z = x + 5 * y + i + 3;
                y = x;
                x = z;

            }
        }
        return z;
    }
}
