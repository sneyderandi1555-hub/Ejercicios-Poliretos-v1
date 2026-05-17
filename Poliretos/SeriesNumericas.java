package Poliretos;

public class SeriesNumericas {



public void mostrarSerieS1(int nroTerminos) {
     int a = 0, b = 1, c;
    System.out.print(a + " " + b + " ");
    for (int i = 0; i < nroTerminos; i++) {
        c = a + b;
        System.out.print(c + " ");
        a = b;
        b = c;
    }
}

public void mostrarSerieS2(int nroTerminos) {

 for (int i = 1; i <= nroTerminos; i += 2) {
        System.out.print(i + " 0 ");
    }

}

public void mostrarSerieS3(int nroTerminos) {
 int a = 0, b = 1, c;

    for (int i = 1; i <= nroTerminos; i += 2) {

        System.out.print(a + "/" + i + " ");

        c = a + b;
        a = b;
        b = c;
    }
}

public void mostrarSeriesS4(int nroTerminos) {
int a = 0, b = 1, c;

    for (int i = 2; i <= nroTerminos; i += 2) {

        System.out.print(a + "/" + i + " ");

        c = a + b;
        a = b;
        b = c;
    }
}

public void mostrarSeriesS5(int nroTerminos) {

    int contador = 0;
    int num = 2;

    while (contador < nroTerminos) {

        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.print(num + " ");
            contador++;
        }

        num++;
    }
    }

public void mostrarSeriesS6(int nroTerminos) {
    for (int i = 1; i <= nroTerminos; i++) {
        System.out.print((i * i) + " ");
    }
    }

public void mostrarSeriesS7(int nroTerminos) {
    for (int i = 1; i <= nroTerminos; i += 3) {
        System.out.print(i + " ");
    }
    }

public void mostrarSeriesS8(int nroTerminos) {
    for (int i = 3; i <= nroTerminos; i += 5) {
        System.out.print(i + " ");
    }
}

public void mostrarSeriesS9(int nroTerminos) {

    int num = 2;

    for (int i = 1; i <= nroTerminos; i++) {
        System.out.print(num + " ");
        num *= 2;
    }
}

public void mostrarSeriesS10(int nroTerminos) {
    int num = 3;

    for (int i = 1; i <= nroTerminos; i++) {
        System.out.print(num + " ");
        num *= 3;
    }
    }

public void mostrarSeriesS11(int nroTerminos) {
    for (int i = 1; i <= nroTerminos; i++) {
        System.out.print(i * (i + 1) + " ");
    }

}

































































































}
