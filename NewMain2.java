

public class NewMain2 {

    public static void main(String[] args) {
        int[] notas = {6, 8, 5, 9, 7};
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (double) suma / notas.length);
    }

}
