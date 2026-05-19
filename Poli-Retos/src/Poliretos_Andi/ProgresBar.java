package Poliretos_Andi;

public class ProgresBar {
/**
 * Muestra una barra de progreso animada utilizando los caracteres
 * del nombre definido dentro del método.
 * Ademas, se aplica una pausa de 200 milisegundos entre cada iteración
 * para generar el efecto visual de animación.
 *
 * @param avance representa la cantidad total de iteraciones o porcentaje.
 *            
 */
public void MostrarProgresBarS9(int avance) {
String nombre = "Andi";
for (int i = 0; i < avance; i++) {
    System.out.print("\r" + nombre.charAt(i % nombre.length()) );
    System.out.print(" " + (i + 1) + "%");
   
    try {
        Thread.sleep(200);
    } catch (InterruptedException e) {
    
    }
}



}
}
