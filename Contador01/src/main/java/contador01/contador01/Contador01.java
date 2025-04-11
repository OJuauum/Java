/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package contador01.contador01;

/**
 *
 * @author juba1
 */
public class Contador01 {

    public static void main(String[] args) {
        int cc = 0;
        /*while (cc < 20) {
            System.out.println("Cambalhota " + (cc + 1));
            cc++;
        }*/
        
        /*while (cc < 20) {
            cc++;
            if(cc == 5 || cc == 7 || cc == 9){
                continue;
            }
            System.out.println("Cambalhota " + cc);
        }*/
        
        while (cc < 10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;
            }
            if (cc == 7) {
                break;
            }
            System.out.println("Cambalhota " + (cc));
        }
    }
}
