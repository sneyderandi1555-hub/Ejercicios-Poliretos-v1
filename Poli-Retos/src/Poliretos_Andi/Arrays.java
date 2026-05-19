package Poliretos_Andi;

public class Arrays {
/**
 * Dibuja un plano de coordenadas positivo utilizando
 * las letras de un nombre para representar la función:
 * f(x) = 2x
 * Cada posición del eje vertical muestra una letra
 * diferente del nombre ingresado.
 * @param nombre representa el texto que será utilizado
 *               para graficar la función.
 */
public void mostrarplanoCartesiano(String nombre) {
    int filas = 10;
    int columnas = 25;
    for (int y = filas; y >= 0; y--) {
        System.out.print(y + " |");
        for (int x = 0; x < columnas; x++) {
            boolean imprimirLetra = false;
            for (int i = 0; i < nombre.length(); i++) {
                int posX = i * 4;
                int posY = (2 * i) + 1;
                if (x == posX && y == posY) {
                    System.out.print(nombre.charAt(i));
                    imprimirLetra = true;
                }
            }
            if (!imprimirLetra) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.print("   ");

    for (int i = 0; i < columnas; i++) {
        System.out.print("_");
    }
    System.out.println();
}
}
