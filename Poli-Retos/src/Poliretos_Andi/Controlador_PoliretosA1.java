package Poliretos_Andi;

public class Controlador_PoliretosA1 {
public void MostrarPoliretos() {

SerieNumerica serienumerica = new SerieNumerica();
SeriesCaracteres seriescaracteres = new SeriesCaracteres();
FigurasEdTam figurasEdTam = new FigurasEdTam();
SerieCadenaCaracteres serieCadenaCaracteres = new SerieCadenaCaracteres();
ProgresBar progresBar = new ProgresBar();
Recursion recursion = new Recursion();
Automata automata = new Automata();
Arrays arrays = new Arrays();

System.out.println("Serie Numerica S9:");
serienumerica.MostrarSerieNumericaS9(5);
System.out.println();
System.out.println("Serie Caracteres S9:");
seriescaracteres.MostrarSerieCaracteresS9('i');
System.out.println();
System.out.println("Figuras Ed Tam S9:");
figurasEdTam.MostrarFiguraEdTam(10);
System.out.println();
System.out.println("Serie Cadena Caracteres S9:");
serieCadenaCaracteres.MostrarSerieCadenaCaracteresS9("Poliretos");
System.out.println();
System.out.println("Progres Bar S9:");
progresBar.MostrarProgresBarS9(100);
System.out.println();
System.out.println("Recursion S9:");
int resultado = recursion.multiplicarRecursivoG3(5, 3);
System.out.println(" ");
automata.validarAutomata("aaaaa");
System.out.println();
arrays.mostrarplanoCartesiano("Andi");

}
}

