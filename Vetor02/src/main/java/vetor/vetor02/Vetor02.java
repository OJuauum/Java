/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package vetor.vetor02;

import java.time.Year;

/**
 *
 * @author juba1
 */
public class Vetor02 {

    public static void main(String[] args) {
        int ano = Year.now().getValue();
        boolean Bissexto = Year.isLeap(ano);
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        
        if(Bissexto){
               System.out.println(ano + " e Bissexto");
        }else {
            System.out.println(ano + " nao e Bissexto");
        }
        
        for (int c = 0; c < mes.length; c++) {
            if (Bissexto) {
                int tot[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                System.out.println("O mes de " + mes[c] + " tem " + tot[c] + " dias ao todo.");
            } else {
                int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                System.out.println("O mes de " + mes[c] + " tem " + tot[c] + " dias ao todo.");
            }
        }
    }
}
