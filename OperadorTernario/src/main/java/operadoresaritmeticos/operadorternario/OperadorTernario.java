/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package operadoresaritmeticos.operadorternario;

/**
 *
 * @author juba1
 */
public class OperadorTernario {

    public static void main(String[] args) {
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        //r = (n1> n2)?0:1;
        r=(n1>n2)?n1+n2:n1-n2;
        System.out.println(r);
    }
}
