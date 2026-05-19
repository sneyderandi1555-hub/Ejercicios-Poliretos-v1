package Poliretos_Andi;

public class SerieNumerica {
/**
 * Genera una serie numérica exponencial multiplicando por 2
 * y muestra los resultados en pantalla.
 * @param numero Cantidad de números que tendrá la serie.
 */
public int MostrarSerieNumericaS9(int numero) {
    int n = numero;
    numero = 2;
    for (int i = 1; i <= n; i++) {
        System.out.print(numero + ",");
        numero=numero*2;
    }
    return numero;
}
}
