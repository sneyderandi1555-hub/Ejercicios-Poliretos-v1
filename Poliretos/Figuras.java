package Poliretos;

public class Figuras {

public void mostrarFiguraF1(int tamaño) {

    for (int i = 1; i <= tamaño; i++) {

        if (i == 1 || i == (tamaño / 2) + 1) {

            for (int j = 1; j <= tamaño; j++) {
                System.out.print("* ");
            }

            System.out.println();

        } else {

            System.out.print("* ");

            for (int j = 1; j < tamaño - 1; j++) {
                System.out.print("  ");
            }

            System.out.println("*");
        }
    }
System.out.println("");
}

public void mostrarFiguraF2(int tamaño) {

    for (int i = 1; i <= tamaño; i++) {

        for (int j = 1; j <= tamaño; j++) {

            if (j == 1 || j == tamaño || i == 1 || i == (tamaño / 2) + 1) {

                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("+ ");
                }

            } else {
                System.out.print("  ");
            }
        }

        System.out.println();
    }
}

public void mostrarFiguraF3(int tamaño) {

    for (int i = 1; i <= tamaño; i++) {

        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}

public void mostrarFiguraF4(int tamaño) {

    for (int i = 1; i <= tamaño; i++) {

        for (int j = 1; j <= tamaño - i; j++) {
            System.out.print("  ");
        }

        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}

public void mostrarFiguraF5(int tamaño) {

    for (int i = tamaño; i >= 1; i -= 2) {

        int espacios = (tamaño - i) / 2;

        for (int j = 1; j <= espacios; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

public void mostrarFiguraF6(int tamaño) {

    for (int i = 1; i <= tamaño; i += 2) {

        int espacios = (tamaño - i) / 2;

        for (int j = 1; j <= espacios; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

public void mostrarFiguraF7(int tamaño) {

    for (int i = 0; i < tamaño; i++) {

        for (int j = 0; j < i * 4; j++) {
            System.out.print(" ");
        }

        System.out.println("___");

        for (int j = 0; j < (i * 4) + 3; j++) {
            System.out.print(" ");
        }

        System.out.println("|");
    }
}

public void mostrarFiguraF8(int tamaño) {

    for (int i = tamaño - 1; i >= 0; i--) {

        for (int j = 0; j < i * 4; j++) {
            System.out.print(" ");
        }

        System.out.print("___");

        System.out.println("|");
    }
}

public void mostrarFiguraF9(int tamaño) {

    for (int i = 0; i < tamaño; i++) {

        // Espacios izquierda
        for (int j = 0; j < (tamaño - i - 1) * 5; j++) {
            System.out.print(" ");
        }

        System.out.print("___|");

        // Espacios centro
        for (int j = 0; j < i * 10; j++) {
            System.out.print(" ");
        }

        System.out.println("|___");
    }
}

public void mostrarFiguraF10(int tamaño) {

    for (int i = 0; i < tamaño; i++) {

        for (int j = 0; j < i * 4; j++) {
            System.out.print(" ");
        }

        if (i % 2 == 0) {
            System.out.println("_+_");
        } else {
            System.out.println("_-_");
        }

        for (int j = 0; j < (i * 4) + 3; j++) {
            System.out.print(" ");
        }

        System.out.println("|");
    }
}

public void mostrarFiguraF11(int tamaño) {

    for (int i = 0; i < tamaño; i++) {

        for (int j = 0; j < i * 4; j++) {
            System.out.print(" ");
        }

        System.out.print("| ");

        for (int j = 0; j <= i; j++) {
            System.out.print("_ ");
        }

        System.out.println();
    }
}

public void mostrarFiguraF12(int tamaño) {

    for (int i = tamaño; i >= 1; i--) {

        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }

        System.out.println();
    }
}

public void mostrarFiguraF13(int tamaño) {

    for (int i = 1; i <= tamaño; i++) {

        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }

        System.out.println();
    }
}

public void mostrarFiguraF14(int tamaño) {

    for (int i = 0; i < tamaño; i++) {

        // Espacios para centrar
        for (int k = 0; k < tamaño - i; k++) {
            System.out.print(" ");
        }

        int num = 1;

        for (int j = 0; j <= i; j++) {

            System.out.print(num + " ");

            num = num * (i - j) / (j + 1);
        }

        System.out.println();
    }
}

public void mostrarFiguraF15(int tamaño) {

    for (int i = 0; i < tamaño; i++) {

        int num = 1;

        for (int j = 0; j <= i; j++) {

            System.out.print(num + " ");

            num = num * (i - j) / (j + 1);
        }

        System.out.println();
    }
}

public void mostrarFiguraF16(int n) {

    for (int i = 1; i <= n; i++) {

        if (i % 2 == 1) {
            System.out.println("+ +");
        } else {
            System.out.println("- -");
        }
    }
}

public void mostrarFiguraF17(int n) {

    for (int i = 1; i <= n; i++) {

        if (i % 2 == 1) {
            System.out.println("1 1");
        } else {
            System.out.println("0 0");
        }
    }
}

public void mostrarFiguraF18(int n) {

    System.out.println("2");

    for (int i = 2; i <= n; i++) {

        System.out.print("1 ");

        int num = 2;

        for (int j = 2; j < i; j++) {

            num += j;

            System.out.print(num + " ");
        }

        System.out.println("2");
    }
}

public void mostrarFiguraF19(int n) {

    System.out.println("*");

    for (int i = 2; i <= n; i++) {

        System.out.print("+ ");

        int num = i;

        for (int j = 2; j < i; j++) {

            System.out.print(num + " ");
            num += j;
        }

        System.out.println("*");
    }
}

}
