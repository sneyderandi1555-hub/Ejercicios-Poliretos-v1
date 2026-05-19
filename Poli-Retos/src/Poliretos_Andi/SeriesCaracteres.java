package Poliretos_Andi;

public class SeriesCaracteres {
/**
 * Muestra una serie de letras con diferentes repeticiones
 * hasta la letra indicada.
 * @param letraFinal Última letra de la serie.
 */
public void MostrarSerieCaracteresS9(char letraFinal) {
  char letra = 'a';
    int[] repeticiones = {1, 1, 1, 2, 3, 5, 8, 13, 21};
    int posicion = 0;
    while (letra <= letraFinal && posicion < repeticiones.length) {
        for (int j = 1; j <= repeticiones[posicion]; j++) {
            System.out.print(letra);
        }
        System.out.print("  ");
        letra++;
        posicion++;
    }      
    }
}

