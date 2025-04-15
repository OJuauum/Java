/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package testefuncao01.testefuncao01;

/**
 *
 * @author juba1
 */
public class TesteFuncao01 {

    /*static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma e " + s);
    }*/
    
    static int soma (int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        int sm = soma(5,2);
        System.out.println("A soma vale " + sm);
    }   
}
