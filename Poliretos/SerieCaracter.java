package Poliretos;

public class SerieCaracter {
public void mostrarSericaracterS1(int nroTerminos) {

    for (int i = 1; i <= nroTerminos; i++) {

        if (i % 2 == 1) {
            System.out.print("+ ");
        } else {
            System.out.print("- ");
        }
    }
}

public void mostrarSeriecaracterS2(int nroTerminos) {

    String texto = "+";

    for (int i = 1; i <= nroTerminos; i++) {

        System.out.print(texto + " ");
        texto += "+";
    }
}

public void mostrarSeriecaracterS3(int nroTerminos) {

    String texto = "++";

    for (int i = 1; i <= nroTerminos; i++) {

        System.out.print(texto + " ");
        texto += "++";
    }
}

public void mostrarSeriecaracterS4(int nroTerminos) {

    String[] signos = {"+", "-", "*", "/"};

    for (int i = 0; i < nroTerminos; i++) {

        System.out.print(signos[i % 4] + " ");
    }
}

public void mostrarSeriecaracterS5(int nroTerminos) {

    String[] signos = {"\\", "|", "/", "-"};

    for (int i = 0; i < nroTerminos; i++) {

        System.out.print(signos[i % 4] + " ");
    }
}

public void mostrarSeriecaracterS6(int nroTerminos) {

    char letra = 'a';

    for (int i = 1; i <= nroTerminos; i++) {

        System.out.print(letra + " ");
        letra++;
    }
}

public void mostrarSeriecaracterS7(int nroTerminos) {

    char letra = 'a';

    for (int i = 1; i <= nroTerminos; i++) {

        if (i % 2 == 1) {
            System.out.print(letra + " + ");
        } else {
            System.out.print(letra + " - ");
        }

        letra += 2;
    }
}

public void mostrarSeriecaracterS8(int nroTerminos) {

    char letra = 'a';

    for (int i = 1; i <= nroTerminos; i++) {

        for (int j = 1; j <= i * 2; j++) {
            System.out.print(letra);
        }

        System.out.print(" ");
        letra++;
    }
}

public void mostrarSeriecaracterS9(int nroTerminos) {

    char letra = 'a';

    for (int i = 1; i <= nroTerminos; i++) {

        for (int j = 1; j <= (i * 2) - 1; j++) {
            System.out.print(letra);
        }

        System.out.print(" ");
        letra++;
    }
}

public void mostrarSeriecaracterS10(int nroTerminos) {

    char letra = 'a';

    for (int i = 1; i <= nroTerminos; i++) {

        for (int j = 1; j <= i; j++) {
            System.out.print(letra);
        }

        System.out.print(" ");
        letra++;
    }
}
}
