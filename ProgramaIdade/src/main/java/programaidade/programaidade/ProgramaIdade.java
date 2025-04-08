/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programaidade.programaidade;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author juba1
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int nasc = teclado.nextInt();
        int i = Year.now().getValue() - nasc;
        System.out.println("Sua idade é " + i);
        if(i>=18){
            System.out.println("Maior de idade!");
        }else{
            System.out.println("Menor de idade!");
        }
    }
}
