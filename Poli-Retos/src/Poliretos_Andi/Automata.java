package Poliretos_Andi;

public class Automata {
/**
 * Valida una cadena compuesta únicamente
 * por letras iguales: a, b o c.
 * Además, muestra el proceso de validación.
 * @param cadena representa la cadena a validar.
 * @return true si la cadena es válida.
 */
public boolean validarAutomata(String cadena) {
    if (cadena.isEmpty()) {
        System.out.println("Cadena vacía no válida");
        return false;
    }
    char inicial = cadena.charAt(0);
    if (inicial != 'a' && inicial != 'b' && inicial != 'c') {
        System.out.println("Símbolo no permitido");
        return false;
    }
    System.out.println("Estado inicial -> " + inicial);
    for (int i = 0; i < cadena.length(); i++) {
        char actual = cadena.charAt(i);
        System.out.println("Leyendo: " + actual);
        if (actual != inicial) {
            System.out.println("Cadena no válida");
            return false;
        }
    }
    System.out.println("Cadena válida");
    return true;
}
}
