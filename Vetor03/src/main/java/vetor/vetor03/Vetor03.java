/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package vetor.vetor03;

import java.util.Arrays;

/**
 *
 * @author juba1
 */
public class Vetor03 {

    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v);
        for (double valor : v) {
            System.out.print(valor + " ");
        }
    }
}
