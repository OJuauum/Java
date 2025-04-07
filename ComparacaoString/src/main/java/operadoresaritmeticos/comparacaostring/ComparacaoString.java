/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package operadoresaritmeticos.comparacaostring;

/**
 *
 * @author juba1
 */
public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "João";
        String nome2 = "João";
        String nome3 = new String("João");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
}
