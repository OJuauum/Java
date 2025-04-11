/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programapernas.programapernas;

import java.util.Scanner;

/**
 *
 * @author juba1
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas?");
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isso é um(a) ");
        switch(perna){
            case 0:
                tipo = "Sem Pernas Grupo: Répteis, Peixes e alguns anfíbios.";
                break;
            case 1:
                tipo = "Saci Criatura mitologica do folclore Brasileiro";
                break;
            case 2:
                tipo = "Bípede Grupo: Mamíferos e Aves";
                break;
            case 3:
                tipo = "Tripé Suportes para cameras";
                break;
            case 4:
                tipo = "Quadrúpedes Grupo: Mamíferos, répteis e anfíbios";
                break;
                default:
                    tipo = "Miriápodes Grupos: Centopeias, Milípedes,Miríapodes";
        }
        System.out.println(tipo);
    }
}
