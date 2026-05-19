package Poliretos_Andi;

public class Recursion {
public int multiplicarRecursivoG3(int a, int b) {
    if (b == 0) {
        return 0;
    }

    int resultado = a + multiplicarRecursivoG3(a, b - 1);

    System.out.println("Resultado parcial: " + resultado);

    return resultado;
}
}
