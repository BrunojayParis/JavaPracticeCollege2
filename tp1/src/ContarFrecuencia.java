// BRUNO JAVIER PARIS - VINF012105 - DNI: 37659313 - 13/06/2022
public class ContarFrecuencia {

    public ContarFrecuencia(){
    }

    int[] conteos = new int[26];
    public void contar(String palabra) {
        for (int i = 0; i < palabra.length(); i++)
            try {
                conteos[palabra.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("El caracter ingresado es incorrecto:" + palabra.charAt(i));
            }
    }

    //imprimir frecuencias

    public void imprimir() {
        for (int i = 0; i < conteos.length; i++) {
            if (conteos[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + conteos[i]);
            }
        }
    }
}
