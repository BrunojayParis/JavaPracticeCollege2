// BRUNO JAVIER PARIS - VINF012105 - DNI: 37659313 - 13/06/2022
import java.util.Scanner;
public class Exc2
{
    public static void main(String[] args) {
        int[] conteos = new int[26];
        Scanner teclado = new Scanner(System.in);
        //Leer palabra del usuario
        System.out.print("Ingrese una palabra (por favor, sólo letras): ");
        String palabra = teclado.nextLine();
        //Convierte a mayusc.
        palabra = palabra.toUpperCase();
        //Cuenta la frecuencia de cada letra...
        for (int i=0; i < palabra.length(); i++)
            try {
                conteos[palabra.charAt(i)-'A']++;
            }catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("El caracter ingresado es incorrecto:" + palabra.charAt(i) );
            }
        //imprimir frecuencias...
        System.out.println();
        for (int i=0; i < conteos.length; i++)
            if (conteos [i] != 0)
                System.out.println((char)(i +'A') + ": " + conteos[i]);



    }



}