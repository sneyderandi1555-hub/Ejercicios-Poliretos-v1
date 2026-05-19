package Poliretos_Andi;

public class FigurasEdTam {
/**
 * Muestra una figura simétrica formada por líneas y espacios
* utilizando el tamaño especificado.
* La figura aumenta progresivamente.
* @param tamaño Cantidad de filas que tendrá la figura.
*/
public void MostrarFiguraEdTam(int tamaño) {
    for (int i = 0; i < tamaño; i++) {

        for (int j = 0; j < (tamaño - i - 1) * 5; j++) {
            System.out.print(" ");
        }
        System.out.print("___|");

        for (int j = 0; j < i * 10; j++) {
            System.out.print(" ");
        }
        System.out.println("|___");
    }
}
}
