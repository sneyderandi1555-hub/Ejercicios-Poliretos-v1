package Poliretos;

import java.util.Random;
import java.util.Scanner;

public class Cadenas_de_Caracteres {
public void mostrarfrase(String frase) {

    int contador = 0;

    for (int i = 0; i < frase.length(); i++) {

        char c = Character.toLowerCase(frase.charAt(i));

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            contador++;
        }
    }

    System.out.println("tiene " + contador + " vocales");
    }

public void mostrarfrase2(String frase) {

    int contador = 0;

    for (int i = 0; i < frase.length(); i++) {

        char c = frase.charAt(i);

        if (c != ' ') {
            contador++;
        }
    }

    System.out.println("tiene " + contador + " letras");
    }

public void mostrarfrase3(String frase, char vocal) {

    String resultado = "";

    for (int i = 0; i < frase.length(); i++) {

        char c = frase.charAt(i);

        if (Character.toLowerCase(c) != Character.toLowerCase(vocal)) {
            resultado += c;
        }
    }

    System.out.println(resultado);
    }

public void mostrarfrase4(String frase, char letra) {
        
    String resultado = "";

    for (int i = 0; i < frase.length(); i++) {

        char c = frase.charAt(i);

        if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
            resultado += c;
        }
    }

    System.out.println(resultado);
    }

public void mostrarfrase5(String frase) {
 
    String resultado = "";

    for (int i = frase.length() - 1; i >= 0; i--) {

        char c = frase.charAt(i);
        char minus = Character.toLowerCase(c);

        if (minus == 'a' || minus == 'e' || minus == 'i' || minus == 'o' || minus == 'u') {
            resultado += Character.toUpperCase(c);
        } else {
            resultado += Character.toLowerCase(c);
        }
    }

    System.out.println(resultado);
    }

 public void mostrarfrase6(String frase) {
    String resultado = "";

    for (int i = frase.length() - 1; i >= 0; i--) {

        char c = frase.charAt(i);

        resultado += Character.toUpperCase(c);
    }

    System.out.println(resultado);
    }

public void mostrarfrase7(String frase) {
    String resultado = "";

    for (int i = 0; i < frase.length(); i++) {

        char c = Character.toUpperCase(frase.charAt(i));

        if (c != 'J') {
            resultado += c;
        }
    }

    System.out.println(resultado);
    }

public void mostrarfrase8(String frase) {
   Scanner sc = new Scanner(System.in);
    Random r = new Random();

    String[] conjunto = {
        "delira", "lidera",
        "ballena", "llenaba",
        "alondra", "ladrona",
        "españa", "apañes",
        "enrique", "quieren"
    };

    int pos = r.nextInt(conjunto.length);
    String palabra = conjunto[pos];

    System.out.println("Palabra: " + palabra);

    int intentos = 0;
    boolean correcto = false;

    while (intentos < 3 && !correcto) {

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Ingrese anagrama: ");
        String usuario = sc.nextLine();

        if (usuario.equalsIgnoreCase(palabra)) {
            correcto = true;
            System.out.println("Correcto");
        } else {
            intentos++;
            System.out.println("Incorrecto");

            if (intentos == 3) {
                System.out.println("Respuesta correcta: " + palabra);
            }
        }
    }
}

public void mostrarfrase9(String frase) {

    String resultado = "";
    boolean mayuscula = true;

    for (int i = 0; i < frase.length(); i++) {

        char c = frase.charAt(i);

        if (c == ' ') {
            resultado += " ";
        } else {
            if (mayuscula) {
                resultado += Character.toUpperCase(c);
            } else {
                resultado += Character.toLowerCase(c);
            }
            mayuscula = !mayuscula;
        }
    }

    System.out.println(resultado);
}
}

