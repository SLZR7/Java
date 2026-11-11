public class NewMain4 {
    public static void main(String[] args) {
        int[] numeros = {4, 12, 7, 20, 9};
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
}
