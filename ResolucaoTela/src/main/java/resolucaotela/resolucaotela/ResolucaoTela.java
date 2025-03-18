package resolucaotela.resolucaotela;

import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        // Para obter o tamanho de uma tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        int largura = (int) screenSize.getWidth();
        int altura = (int) screenSize.getHeight();
        System.out.println("Resolucao de tela principal: " + largura + "X" + altura);
        System.out.println("----------------------------------------------------");
        
        // Obter a resolução de mais de uma tela
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] screens = ge.getScreenDevices();
        
        for (int i = 0; i < screens.length; i++) {
            DisplayMode dm = screens[i].getDisplayMode();
            int largurai = dm.getWidth();
            int alturai = dm.getHeight();
            
            System.out.println("Monitor " + (i + 1) + ": " + largurai + "X" + alturai);
        }
    }
}
