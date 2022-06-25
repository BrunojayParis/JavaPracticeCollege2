// BRUNO JAVIER PARIS - VINF012105 - DNI: 37659313 - 13/06/2022
import java.util.Scanner;
public class IngresarPalabras {
    public static void main(String[] args) {
        ContarFrecuencia cont = new ContarFrecuencia();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese cantidad de palabras:  ");
            int cantidadDePalabras = Integer.parseInt(sc.nextLine());
            String[] palabras;
            palabras = new String[cantidadDePalabras];
            for (int i = 0; i < cantidadDePalabras; i++) {
                System.out.println("Ingresar palabra nro " + (i + 1) );
                palabras[i] = sc.nextLine();
            }
            System.out.println("Palabras elegidas" );
            int n=1;
            for (String palabra : palabras) {
                palabra = palabra.toUpperCase();
                System.out.println(n + ") "+ palabra);
                n++;
            }
            System.out.println("Ingresar el numero de la palabra a la que se le realizara el conteo de Frecuencia: " );
            int palabraElegida = Integer.parseInt(sc.nextLine());
            cont.contar(palabras[palabraElegida-1].toUpperCase());
            cont.imprimir();

        } catch (NumberFormatException exc) {
            System.out.println("Debe ingresar un numero");
        }

    }

}
