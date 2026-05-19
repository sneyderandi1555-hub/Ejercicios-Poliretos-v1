package Poliretos_Andi;

public class SerieCadenaCaracteres {
/**
 * Convierte las letras mayúsculas en minúsculas
 * y las minúsculas en mayúsculas.
 * @param frase Texto para trasformar.
 */
    public void MostrarSerieCadenaCaracteresS9(String frase) {
 String resultado = "";
    for (int i = 0; i < frase.length(); i++) {
        char letra = frase.charAt(i);
        if (Character.isUpperCase(letra)) {
            resultado += Character.toLowerCase(letra);
        } else {
            resultado += Character.toUpperCase(letra);
        }
    }
    System.out.println(resultado);
    }
    }   

