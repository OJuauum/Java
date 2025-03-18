package idiomasistema.idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.print("Seu sistema esta em ");
        System.out.print(idioma.getDisplayLanguage());
    }
}
