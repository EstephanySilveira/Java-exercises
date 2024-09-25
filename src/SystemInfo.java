import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class SystemInfo {

    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("O dia e a hora do sistema é: " + relogio.toString());

        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é: " + loc.getDisplayLanguage());

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do sistema é: " + d.width + " x " + d.height);

    }

}